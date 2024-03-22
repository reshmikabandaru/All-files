package demo;
abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
}

public class Reshmika_As1 extends Book {
   @Override
	void setTitle(String s) {
		
		
		System.out.println("This title is: "+ s);
	}
public static void main(String[] args) {
	
		Reshmika_As1 mb = new Reshmika_As1();
		  mb.setTitle("Tale of two cities");
}

}
