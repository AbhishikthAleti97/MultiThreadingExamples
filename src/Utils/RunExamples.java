package Utils;
import Examples.BasicMultiThread;
import Examples.MultiNumberSync;
import Examples.MultiPrintNumbers;
import Examples.MultiThreadInterface;
import Examples.RunSynchronizedThreads;
import Examples.SetRandomName;
import Examples.SetRandomPriority;
import Examples.SleepyThread;

public class RunExamples {
	
	public static void executeExample(int exampleNo)
	{
		switch(exampleNo) {
		case 0: 
			System.out.println("Running a basic thread by extending with Thread object.");
			BasicMultiThread a = new BasicMultiThread();
			a.runThread();
			break;
		case 1:
			System.out.println("Running a basic thread through Runnable.");
			MultiThreadInterface b = new MultiThreadInterface();
			b.runThread();
			break;
		case 2:
			System.out.println("Running a thread that falls asleep, at regular intervals.");
			SleepyThread s = new SleepyThread();
			s.runThread();
			break;
		case 3:
			System.out.println("Print Multiple numbers unsynchronized");
			MultiPrintNumbers m = new MultiPrintNumbers();
			m.runPrintNumbers();
			break;
		case 4:
			System.out.println("Print Multiple Numbers Synchronized");
			MultiNumberSync mns = new MultiNumberSync();
			mns.runThread();
			break;
		case 5:
			System.out.println("Set a random name to a thread, and run the thread");
			SetRandomName srn = new SetRandomName();
			srn.runThread();
			break;
		case 6:
			System.out.println("Running a thread with a random priority set to it between 1 and 10");
			SetRandomPriority srp = new SetRandomPriority();
			srp.runThread();
			break;
		case 7:
			System.out.println("Running two threads with a synchronized block");
			RunSynchronizedThreads rst = new RunSynchronizedThreads();
			rst.runThread();
			break;
		default:
			System.out.println("Sorry, that was an invalid option. Please pick another item from the menu.\n");
		}
	}
	
}
