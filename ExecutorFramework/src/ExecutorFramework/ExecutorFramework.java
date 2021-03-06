package ExecutorFramework;
import java.util.concurrent.*;
import java.util.*;
class Producer implements Runnable{
	BlockingQueue queue;
	Producer(BlockingQueue bq){
	queue=bq;
	}
	public void run() {
	System.out.println("jojo");
	try {	queue.put(1);
	queue.put(2);queue.put(3);
	}
	catch(InterruptedException e) {
		System.out.println("eiuu");
	}
	}
	
}
class Consumer implements Runnable{
	BlockingQueue queue;
	Consumer(BlockingQueue bq){
	queue=bq;
	}
	public void run() {
	try {	
	System.out.println(queue.take());
	System.out.println(queue.take());
	System.out.println(queue.take());
	}
	catch(InterruptedException e) {
		System.out.println("eiu2u");		
	}
	}
	
}
class Task implements Callable<String>{
int a=10;
	@Override
	public String call() throws Exception{
		return ""+a;
	}
}
class Task2 implements Callable<String>{
int a=10;
	@Override
	public String call() throws Exception{
		return ""+a;
	}
}
class Task3 implements Runnable{
	public void run() {
		System.out.println("Hello Runnable");
	}
}
class ExecutorFramework extends Thread{
	public void usingCallable() {
		Task t=new Task();
		Task2 t1=new Task2();
		ExecutorService executorservice=Executors.newFixedThreadPool(3);
		Future <String> result=executorservice.submit(t);
		Future <String> result2=executorservice.submit(t1);
		
		try {
			System.out.print(result.get()+result2.get());
		}catch(Exception e) {
			System.out.println("Exception");
		}
		executorservice.shutdown();
	}
	public void usingRunnable(){
		ExecutorService es= Executors.newFixedThreadPool(3);
		Task3 t=new Task3();
		try {
		es.execute(t);
		}catch(Exception e){
		}
		es.shutdown();
		
	}
	public void usingBlockingQueue(){
		BlockingQueue bq=new ArrayBlockingQueue(1024);
		Producer p=new Producer(bq);
		Consumer c=new Consumer(bq);
		Thread f=new Thread(p);
		Thread f2=new Thread(c);

		f.start();
		f2.start();
	}
	public void usingThreadGroup() {
		ThreadGroup t1=new ThreadGroup("Parent");
		Thread tt=new Thread(t1,new Thread(),"One");
		Thread tt4=new Thread(t1,new Thread(),"Two");
		System.out.println("gg "+t1.getName());
		System.out.println(tt.getThreadGroup());
		t1.list();
	}
	public static void main(String[] args) {
		System.out.println("1.Using Callable\n2.using Runnable");
		Scanner s=new Scanner(System.in);
		int h=Integer.parseInt(s.nextLine());
		ExecutorFramework e=new ExecutorFramework();
		switch(h){
		case 1:
			e.usingCallable();
			break;
		case 2:
			e.usingRunnable();
			break;
		case 3:
			e.usingBlockingQueue();
			break;
		case 4:
			e.usingThreadGroup();
			break;
		}
	}

}
