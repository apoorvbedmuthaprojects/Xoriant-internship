package locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class MyThread extends Thread
 
{
	MyThread(String name)
	{
		super(name);
	}
	  
	 
	static ReentrantLock L = new ReentrantLock();
	
	public void run()
	{
		do
		{
			try{
				if(L.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+".....got lock.");
					Thread.sleep(30000);
					L.unlock();
					System.out.println(Thread.currentThread().getName()+".....releases lock.");
					break;
					
				}//Thread will never get into waiting state.
				else
				{
					System.out.println(Thread.currentThread().getName()+".....unable to get lock,will try again.");
				}
				
			}
			catch(Exception e)
			{
				
			}
		}while(true);
	}
}
class Reentrant2
{
public static void main(String[] args)
{
	 ReentrantLock I = new ReentrantLock();
	I.lock();
	I.lock();
	System.out.println(I.isLocked());//true
	System.out.println(I.isHeldByCurrentThread());//tru
	System.out.println(I.getQueueLength());//
	I.unlock();
	System.out.println(I.getHoldCount());//1
	System.out.println(I.isLocked());//true
	I.unlock();
	System.out.println(I.isLocked());//false
	System.out.println(I.isFair());
	
	MyThread t1=new MyThread("T1");
	MyThread t2=new MyThread("T2");
	
	t1.start();
	t2.start();
	}
}