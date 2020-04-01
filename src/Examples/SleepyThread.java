package Examples;

public class SleepyThread extends Thread{
	public void run()
	{
		System.out.println("Running a thread, soon going to sleep");
		for(int i=0;i<3;i++)
		{
			System.out.println("	Sleepy thread is going to sleep "+ (i+1) +" times");
			try {
				Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println("Exception caught: "+e);
			}
			System.out.println("	Rise and shine");
		}
	}
	public void runThread()
	{
		SleepyThread s1 = new SleepyThread();
		s1.start();
	}
}
