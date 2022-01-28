package AssistedPractice;

public class MyThread extends Thread {
	
	public void run()
	{
	 System.out.println("concurrents thread started running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt= new MyThread();
		mt.run();

	}

}
