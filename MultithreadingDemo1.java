//Create thread by extending Thread class and use basic thread properties.

class Demo1 extends Thread
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println("Executing Thread: "+Thread.currentThread().getName() + ": "+i);
			
			try {Thread.sleep(1000);} catch(Exception e) {}
			
		}
	}
}
   
public class MultithreadingDemo1 {
	
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Demo1());
		Thread t2 = new Thread(new Demo1());
		
		t1.setName("One");
		t2.setName("Two");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {}
	}

}
