package assignment_javaprograms;

class testcase1 {
	testcase1(){
		
		System.out.println("super");
		}
}
class Screenshot extends testcase1	{
	Screenshot(){
		
		System.out.println("screenshot");
	}
}
	
	public class Super_calling extends Screenshot{
		Super_calling(){
			super();//implicitly and explicitly
			System.out.println("testcase");
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Super_calling();}
		
	}
	


