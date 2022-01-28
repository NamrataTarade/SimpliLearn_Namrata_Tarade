package AssistedPractice2;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=45,b=0,rs = 0;
		
		try {
			rs=a/b;
			}
		catch(ArithmeticException Ex)
		{
			System.out.println("\n\tError:" + Ex.getMessage());
		}
		finally
		{
			System.out.println("\n\tThe result is:"+ rs);
		}
	
	}

}
