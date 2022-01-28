package AssistedPractice2;

class MyException1 extends Exception{
	String str1;
	MyException1(String str2){
		str1=str2;
	}
	
	public String toString(){
		return("MyException1 Occurred:" + str1);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Starting of try block");
			throw new MyException1("This is My error Message");
		}
		catch(MyException1 exp)
		{
			System.out.println("catch Block");
			System.out.println(exp);
		}

	}

}
