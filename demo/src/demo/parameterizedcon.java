package demo;

public class parameterizedcon {
	String name;
	int age;
	parameterizedcon(String n,int a)
	{
		name = n;
		age = a;
		
		
	}
	void display()
	{
		System.out.println(name+""+age);
		
	}
  public static void main(String[] args) {
	  
	  parameterizedcon e1 = new parameterizedcon ("reshmika",18);
		e1.display();

	}
   
   

}