package assignment_javaprograms;

 class riding {
	 void login() {
		 System.out.println("Add name");
	 }
	 }
final public class Method_overriding extends riding{
	void login() {
		System.out.println("Add fullname");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overriding r1=new Method_overriding ();
		r1.login();
		

	
	}
}
