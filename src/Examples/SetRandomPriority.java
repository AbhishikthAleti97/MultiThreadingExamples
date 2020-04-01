package Examples;

import java.util.Random;

public class SetRandomPriority implements Runnable{
	public void run()
	{
		System.out.println("Priority of the current running thread: " + Thread.currentThread().getPriority());
	}
	
	public void runThread()
	{
		Random r = new Random();
		SetRandomPriority srp = new SetRandomPriority();
		Thread t1 = new Thread(srp);
		t1.setPriority(r.nextInt(1000)%9 + 1);
		t1.start();
	}
}
