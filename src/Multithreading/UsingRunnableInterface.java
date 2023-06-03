package Multithreading;

public class UsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Welcome, you are in run method "+Thread.currentThread().getName());
		
	}
	
	public static void main(String args[]) {
		UsingRunnableInterface obj1=new UsingRunnableInterface();
		Thread t1=new Thread(obj1);
		t1.start();
		
		UsingRunnableInterface obj2=new UsingRunnableInterface();
		Thread t2=new Thread(obj2);
		t2.start();
	}
}
