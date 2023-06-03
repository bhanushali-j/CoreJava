package Multithreading;

/*Important points : 
Start() actually creates a new thread and the run() method is executed on the newly created thread.
If we directly call run() method then it will just run the code written in run() in the main method itself.
*/

/*yield() : if a thread wants to pass its execution give chance to threads with same or higher priority.
join()  : if a thread wants to wait until another thread finishes its execution i.e dies.
sleep() : if a thread does not want to do anything for particular amount of time.*/


/*The wait(),notify() and notifyAll() methods are used for inter thread communication.
** IMP : They are Object class's methods 
wait() : when called wait a thread goes into waiting state until other thread calls either 
		 notify() or notifyAll() on the same object.
notify() :  Used to notify and wake up only oe thread that is waiting for the object and 
			that thread starts the execution.
notifyAll() : It notifies all the threads that are waiting on an object. 
*/
public class UsingThreadClass extends Thread {
	
	UsingThreadClass(){
		
	}
	UsingThreadClass(String name){
		super(name);
	}
	public void run() {
		System.out.println("Welcome, you are in run method "+Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		UsingThreadClass obj1=new UsingThreadClass();
		obj1.start();
		
		//Custom thread name=ThreadGoku passed
		UsingThreadClass obj2=new UsingThreadClass("ThreadGoku");
		obj2.start();
		
		/*
		 * No new thread created with Name=ThreadGohan, however main thread runs the
		 * code when directly run() is called.
		 */
		UsingThreadClass obj3=new UsingThreadClass("ThreadGohan");
		obj3.run();
		
	}
}


