//Synchronization of threads

class Demo4 extends Thread
{
	public int iCnt = 0;
	
	public synchronized void run()
	{
		for(int i = 1; i<=10; i++)
		{
			iCnt = iCnt+1;		
			System.out.println("Currently executing thread: " +Thread.currentThread().getName()+ ": " + iCnt);
			
			//try{Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}


public class MultithreadingDemo4 {

	public static void main(String args[])
	{
		Thread t1 = new Thread(new Demo4());
		Thread t2 = new Thread(new Demo4());
		
		t1.setName("First");;
		t2.setName("Second");
		
		t1.start();
		t2.start();
	}
}
