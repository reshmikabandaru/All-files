package demo;

public class trycatch {

	public static void main(String[] args) {
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
     
       finally
       {
    	   System.out.println("executed");
    	   
       }
		System.out.println("rest code");
	}

}
