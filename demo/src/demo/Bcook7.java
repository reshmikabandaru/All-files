package demo;

public  abstract class Bcook7 {
	
	abstract void serve();
	abstract void preparebiryani();
	  void  getingredients()
	    {
		System.out.println("processing");
	}
}

class biryani extends Bcook7{
	
	 void serve()
	{
		System.out.println("ready");
		
}
	 void preparebiryani()
	{
		
		System.out.println("boiling");

	}
	

	public static void main(String[] args) {
	
     biryani obj = new biryani();
     obj.serve();
     obj.preparebiryani();
     obj.getingredients();
     
	} 

}
