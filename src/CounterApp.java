import java.util.Scanner;
public class CounterApp {
	public static void main(String[]args){
		System.out.println("Press the enter key to stop the timer");
		Thread counter = new Thread(new Counter());
		Thread mom=new Thread(new MomInterrupt());
		counter.start();
		mom.start();
		Scanner keyboard = new Scanner(System.in);
		String s="start";
		while(!s.equals("")){
			s=keyboard.nextLine();
		}
		counter.interrupt();
		mom.interrupt();
		keyboard.close();
	}
}

