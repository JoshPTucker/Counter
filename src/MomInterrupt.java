
public class MomInterrupt implements Runnable {
	@Override
	public void run(){
		Thread ct2 =Thread.currentThread();
		int count=1;
		
		while(true){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				break;
			}
			if (count==2){
			System.out.println("Mom?");
			count=0;	
			}
			count++;
		}
		System.out.println("Hi mom");
	}
}
