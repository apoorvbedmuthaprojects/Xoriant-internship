class NumberClass {
    //synchronized method to print squares of numbers
    synchronized void printSquares(int n) throws InterruptedException 
    {
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " :: "+  i*i);
            Thread.sleep(500);
        }
    }
}


public class MultithreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final NumberClass number = new NumberClass();
	        Runnable thread = new Runnable()   {
	            public void run()   {
	                try {
	                    number.printSquares(3);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };
	        new Thread(thread, "Thread One").start();
	        new Thread(thread, "Thread Two").start();

	}

}
