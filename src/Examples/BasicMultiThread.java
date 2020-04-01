package Examples;

public class BasicMultiThread extends Thread{
	public void run()
	{
		System.out.print("Thread is running, using Thread type object\n\n");
	}
	public void runThread()
	{
		BasicMultiThread b1 = new BasicMultiThread();
		b1.start();
	}
}
