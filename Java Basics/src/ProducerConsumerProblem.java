
//Problem Statement
//There are two processes, a producer and a consumer, that share a common buffer with a limited size.
//The producer “produces” data and stores it in the buffer, and the consumer “consumes” the data, removing it from the buffer.
//Having two processes that run in parallel, we need to make sure that the producer will not put new data in the buffer
//when the buffer is full and the consumer won’t try to remove data from the buffer if the buffer is empty.


class Buffer1
{
	int iCnt;
	
	boolean flag = false;
	
	public synchronized void produce(int iCnt) throws InterruptedException
	{
		if(flag)
		{
			wait();
		}
		
		this.iCnt = iCnt;
		System.out.println("produced item: " + this.iCnt);
		flag = true;
		notify();
		
	}
	
	public synchronized int consume() throws InterruptedException
	{
		if(!flag)
		{
			wait();
		}
		System.out.println("Consumed item: " + this.iCnt);
		flag = false;
		notify();
		return iCnt;
		
		
	}
}


class Producer extends Thread
{
	Buffer1 b;
	
	Producer(Buffer1 b)
	{
		this.b = b;
	}
	
	public void run()
	{
		int i = 1;
		while(true)
		{
			try {
				this.b.produce(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {Thread.sleep(500);} catch(Exception e) {}
			i++;
		}
		
	}
}

class Consumer extends Thread
{
	Buffer1 b;
	
	Consumer(Buffer1 b)
	{
		this.b = b;
	}
	public void run()
	{
		while(true)
		{
			try {
				this.b.consume();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}


public class ProducerConsumerProblem {
	public static void main(String args[])
	{
		Buffer1 bobj = new Buffer1();
		Thread t1 = new Thread(new Producer(bobj));
		Thread t2 = new Thread(new Consumer(bobj));
	
		t1.start();
		t2.start();
	}
	
}
