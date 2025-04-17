package assignment_javaprograms;

 class childone {
	 childone(int a){
		 int b=23;
		 int c=45;
		 int d=23+45;
		 
		System.out.println(d);
	}
	}
class valueunder extends childone {
	valueunder(String a){
		super(10);
		
		System.out.println("values");
	}
}
public class Super_paramtzd extends valueunder{
	Super_paramtzd(){
	super("aman");
		System.out.println("end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Super_paramtzd();
		
		
		
	}}
	

