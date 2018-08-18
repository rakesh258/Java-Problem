
class Test {
	
	
	Test(){
		//Constructor call must be the first statement
		this(10);
		System.out.println("No arg Constructor");
		
	}
	
	Test(int i){
		//Constructor call must be first statement otherwise it returns run time error.
		this(10,20);
		
		System.out.println("One arg Constructor");
		
	}
	Test(int i, int j){
		
		System.out.println("Two arg Constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test a = new Test();
		System.out.println("------------------------------->");
		Test b = new Test(10);
		System.out.println("------------------------------->");
		Test c = new Test(10,20);
		

	}

}
