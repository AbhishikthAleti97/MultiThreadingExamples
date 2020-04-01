package Examples;

public class MultiThreadInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running via runnable interface\n\n");
	}
	
	public void runThread()
	{
		MultiThreadInterface m1 = new MultiThreadInterface();
		Thread t = new Thread(m1);
		t.start();
	}
	

}
