import java.util.concurrent.*;
import java.util.Random;  

class TaskPrint implements Runnable 
{ 
	private final String name; 
	private final int delay; 
	public TaskPrint(String name, int delay) 
	{ 
		this.name = name; 
		this.delay = delay; 
		} 
	public void run() 
	{ 
		System.out.println("Starting: " + name); 
		try { 
			Thread.sleep(delay); 
			} catch (InterruptedException ignored) { } 
		
		System.out.println("Done with: " + name); 
	} 
}



public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // Create an executor of thread pool size 3 
		ExecutorService executor = Executors.newFixedThreadPool(3); 
		
		// Sum up wait times to know when to shutdown 
		int waitTime = 600; 
		for (int i=0; i<10; i++) 
		{ 
			String name = "NamePrinter " + i; 
			int time = random.nextInt(500); 
			waitTime += time; 
			Runnable runner = new TaskPrint(name, time); 
			System.out.println("Adding: " + name + " / " + time); 
			executor.execute(runner); 
			} 
		try { 
			Thread.sleep(waitTime); 
			executor.shutdown(); 
			executor.awaitTermination(waitTime, TimeUnit.MILLISECONDS); 
			} catch (InterruptedException ignored) { } 
		
		System.exit(0);

		

	}

}
