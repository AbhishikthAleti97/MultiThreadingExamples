package Examples;

public class MultiPrintNumbers extends Thread{
	public void run()
	{
		String threadName = Thread.currentThread().getName();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" thread: "+threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void runPrintNumbers()
	{
		MultiPrintNumbers mPN1 = new MultiPrintNumbers();
		MultiPrintNumbers mPN2 = new MultiPrintNumbers();
		mPN1.start();
		mPN2.start();
	}
}
