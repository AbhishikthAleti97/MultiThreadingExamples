package Examples;

public class MultiNumberSync extends Thread{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=0;i<4;i++)
		{
			System.out.println(i+" Thread: "+name);
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void runThread()
	{
		MultiNumberSync mNS1 = new MultiNumberSync();
		MultiNumberSync mNS2 = new MultiNumberSync();
		mNS1.start();
		try {
			mNS1.join();
		}catch(Exception e)
		{
			System.out.print("Exception caught "+e);
		}
		mNS2.start();
		
	}
}
