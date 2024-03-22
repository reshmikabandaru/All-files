package demo;

public class Oloadex7 {
	
	public void area(int a, int b)
	{
	  int k = a * b;
	  System.out.println("area of the "+k);
	}
	public float area(float a,float b)
	{
		
	  float p = a * b;
		System.out.println("area of the "+p);
		return p;

	}
	public static void main(String args[]) {
		
		Oloadex7 obj = new Oloadex7();
		obj.area(2, 3);
		obj.area(2.3f, 3.4f);
		
		
	}
}
