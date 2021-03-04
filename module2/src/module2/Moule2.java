package module2;

class Thread2 extends Thread{
	public void run(){
	System.out.println("Thread2 is running"+Thread.currentThread().getPriority());	
	}
	}
class Module2 extends Thread{
	public void run(){
		try {
		Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("Exception is here");
		}
		System.out.println("Thread1 is running ..."+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Module2 m=new Module2();
		Thread2 i=new Thread2();
		System.out.println("Thread1 name"+m.getName());
		m.setName("Sanyog");
		System.out.println("Thread1 name"+m.getName());
		m.start();
		i.start();
	}

}
