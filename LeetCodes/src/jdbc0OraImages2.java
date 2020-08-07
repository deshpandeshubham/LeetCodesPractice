import java.io.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
	
public class jdbc0OraImages2 extends JFrame {
	
  public static JLabel jlabel = new JLabel("Wyoming State Flag");
  
  public jdbc0OraImages2 () {
	setBounds(150,150,800,600);
	Container contentPane = getContentPane();
    JPanel jpanel = new JPanel();
    jpanel.add(jlabel);
    contentPane.add(jpanel,"Center");
  }
  
  public static void main(String [] aa) {
	String url;
    Blob img;
    ImageIcon icon = null;
    Image img3 = null;
    BufferedImage img2 = null;
    byte[] imgData = null ;
    url = "jdbc:oracle:thin:@localhost:1521:orcl";
    Statement stmt;
    Connection con;
    String query = "select * from wyoming_state";
    try { 
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    }   
    catch (Exception e) {
      System.out.println("MR.UnitSitQueries.constructor.Exception: " + e);
    }
    try {
      con = DriverManager.getConnection(url,"sys as sysdba",aa[0]);
      stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query); 
      while (rs.next()) {
        img = rs.getBlob(3);
        imgData = img.getBytes(1,(int)img.length());
        try { 
        	img2 = ImageIO.read(new ByteArrayInputStream(imgData));
        } catch(Exception e){};
        img3 = img2;
        icon = new ImageIcon(img3);
        jdbc0OraImages2.jlabel.setIcon(icon);
      }
    }
    catch (SQLException e) {
    	System.out.println("OOPS" + e.getMessage());
    }
    jdbc0OraImages2 jfram = new jdbc0OraImages2();
    jfram.setVisible(true);
  	}
}