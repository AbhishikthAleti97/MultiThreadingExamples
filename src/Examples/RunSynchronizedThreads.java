package Examples;


public class RunSynchronizedThreads implements Runnable{
	public class Sender{
		public String name;
		Sender(String s)
		{
			name = s;
		}
	}
	public void run()
	{
		Sender send = new Sender("Sending from "+Thread.currentThread().getName());
		synchronized(send)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i+" time "+send.name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void runThread()
	{
		RunSynchronizedThreads rst1 = new RunSynchronizedThreads();
		RunSynchronizedThreads rst2 = new RunSynchronizedThreads();
		Thread t1 = new Thread(rst1);
		Thread t2 = new Thread(rst2);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
		/*try {
			t1.join();
			t2.join();
		} catch(InterruptedException e)
		{
			System.out.println(e);
		}*/
	}
}

