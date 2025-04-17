package assignment_javaprograms;

public class This_calling {
	This_calling(){
		this (10);
		System.out.println("result1");
		}
	This_calling(int a){
		this("saru");
		System.out.println("result2");
	}
	This_calling(String a){
		this(10,54);
		System.out.println("result3");
		}
	This_calling(int a, int b){
		System.out.println("result4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ready");
		new This_calling();
		
}
}
