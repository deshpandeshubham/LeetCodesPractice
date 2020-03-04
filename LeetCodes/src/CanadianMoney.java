import java.util.*;

public class CanadianMoney {

	public static void dispense(int balance, int withdraw, List<Integer> packets) {
		int availableBal = 0;
		Collections.sort(packets, Collections.reverseOrder());
		List<String> list = new ArrayList<>();
		if(withdraw > balance) {
			System.out.println("Not enough balance");
			return;
		}
		else
			availableBal = balance - withdraw;
		for(int i=0;i<packets.size() && withdraw!=0;i++) {
			if(withdraw >= packets.get(i))
				list.add(withdraw / packets.get(i) + ":" + packets.get(i));
			withdraw %= packets.get(i);
		}
		if(withdraw != 0) {
			System.out.println("Cannot put into packets");
			return;
		}
		for(int i=list.size()-1;i>=0;i--) 
			System.out.print(list.get(i) + " ");
		System.out.print(availableBal);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> packets = new ArrayList<>();
		int balance = 0, withdraw = 0, packSize = 0;
		//balance = sc.nextInt();
		//withdraw = sc.nextInt();
		//packSize = sc.nextInt();
		//for(int i=0;i<packSize;i++)
		//packets.add(sc.nextInt());
		packets.add(2);
		packets.add(5);
		packets.add(10);
		packets.add(50);
		packets.add(100);
		//packets.add(2147483647);
		dispense(1000, 567, packets);
	}
}
