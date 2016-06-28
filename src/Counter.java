import java.util.concurrent.SynchronousQueue;

public class Counter implements Runnable {
	@Override
	public void run(){
	Thread ct =Thread.currentThread();
	int count=1;
	System.out.println("Timer Begins");
	while(true){
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			break;
		}
		System.out.println("Elapsed Time: "+count+" seconds");
		count++;
	}
	System.out.println("User paused the timer");
}
}