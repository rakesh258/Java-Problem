
// SUPER class program
class p{
	
	p(){
		//Here super() is created by JVM
		System.out.println("Parent class");
		
	}
}

class c extends p{
	c(){
		//Here super() is created by JVM
		System.out.println("Child class");
	}
}

class superTest{
	
	public static void main(String[] args) {
		
		c c1 = new c();
		
	}
}