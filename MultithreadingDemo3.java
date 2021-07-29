//priority of thread

class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("Priority of currently executing thread: " +Thread.currentThread().getPriority());
	}
}

public class MultithreadingDemo3 {
	
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Demo3());
		
		//t1.setPriority(Thread.MIN_PRIORITY);   //1
		//t1.setPriority(Thread.NORM_PRIORITY);   //5
		
		 t1.setPriority(Thread.MAX_PRIORITY);   //10
		
		  t1.start();
	}

}
