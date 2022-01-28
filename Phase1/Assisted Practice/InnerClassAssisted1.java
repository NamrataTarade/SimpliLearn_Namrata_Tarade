package AssistedPractice;

public class InnerClassAssisted1 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerClassAssisted1  ob=new InnerClassAssisted1 ();  
		ob.display();  
		
		
	}

}
