
class Dog{
	
	public String toString() {
	return getClass().getName() + " "+'#' +" Dog Object";
	}
}

public class FirstString {

	public static void main(String[] args) {

		Dog n=new Dog();
		String s=new String("Hello");
		System.out.println(n);
		//System.out.println(n.toString());
		
	}

}
