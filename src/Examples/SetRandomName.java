package Examples;

import java.util.Random;

public class SetRandomName implements Runnable{
	String[] arr = {"Donkey", "Monkey", "Giraffe","Dog","Cat","Goat","Llama","Sheep","Ferret"};
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread's name is: "+name+"\n\n");
	}
	public void runThread()
	{
		Random r = new Random();
		int rand = r.nextInt(1000)%arr.length;
		String name = arr[rand];
		SetRandomName srn = new SetRandomName();
		Thread t1 = new Thread(srn);
		t1.setName(name);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
