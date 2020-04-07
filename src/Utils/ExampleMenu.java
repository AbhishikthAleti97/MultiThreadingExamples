package Utils;

import java.util.Scanner;

public class ExampleMenu {
	public void runMenu()
	{
		while(true)
		{
			System.out.println("From the given set of choices pick the example you'd like to execute");
			System.out.println("1. Run a Basic thread which inherits from 'Thread'");
			System.out.println("2. Run a Basic thread which implements the Interface 'Runnable'");
			System.out.println("3. Demonstrate the Sleep function");
			System.out.println("4. Demonstrate Multiple Threads running");
			System.out.println("5. Demonstrate Multiple Threads running, with join");
			System.out.println("6. Run a thread by giving it a random name");
			System.out.println("7. Set a random priority to a thread");
			System.out.println("8. Demonstrate Multiple threads running, with a synchronized block");
			System.out.println("0. Exit");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt() - 1;
			if(opt==-1) System.exit(0);;
			RunExamples.executeExample(opt);
		}
	}
}
