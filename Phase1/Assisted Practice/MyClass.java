package AssistedPractice;

public class MyClass {

	private static Object LOCK = new Object();
	

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("Thread" + Thread.currentThread().getName()+ " is woken after sleeping for 1 second ");
		synchronized(LOCK)
		{
			LOCK.wait(1000);
			System.out.println("object" + LOCK +"is woken after " + "waiting for 1 second");
		}
		

	}

}
