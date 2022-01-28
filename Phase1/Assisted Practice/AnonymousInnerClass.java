package AssistedPractice;

abstract class InnerClassAssisted3 {
	 public abstract void display();
}

public class AnonymousInnerClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassAssisted3 i = new InnerClassAssisted3() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      
	      i.display();
	   }
	}

