package assignment_javaprograms;

class saru_call{
	
	void login() {
		System.out.println("enter the name");	}
}


public class Sup_keyword extends saru_call{
	void login() {
		super.login();
		System.out.println("enter the fullname");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup_keyword s1=new Sup_keyword();
		s1.login();

	}

}
