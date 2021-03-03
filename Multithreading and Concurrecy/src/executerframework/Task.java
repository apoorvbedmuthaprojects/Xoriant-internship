package executerframework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task
{
	public static void main(String args[])
	{
		 final class TaskWorker {
				void finishTask()
				{
				ExecutorService service=Executors.newFixedThreadPool(10);
				for(int i=0;i<100;i++)
				{
				 service.submit(new TaskProducer(i));
				}
				
			}
				
		 final class TaskProducer implements Runnable
		{
			private int TaskId;
			public TaskProducer(int id)
			{
				TaskId=id;
			}
			
			public void run()
			{
				System.out.println("Task id:"+this.TaskId +"performed by"+Thread.currentThread().getName());
			}
		}
	}
		 TaskWorker t1=new TaskWorker();
		 t1.finishTask();
}
}