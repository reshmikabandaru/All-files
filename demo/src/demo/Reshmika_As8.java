package demo;
import java.util.*;

class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}


class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}





class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override 
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Reshmika_As8{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter state:");
	
	String str = sc.next();
	
	WestBengal wb = new WestBengal();
	AndhraPradesh ap= new AndhraPradesh();
	Karnataka k = new Karnataka();
	if(str.equals("WestBengal"))
	{
		Jasmine j = wb. yourNationalFlower();
		
		System.out.println(j.whatsYourName());
	}
	
	if(str.equals("AndhraPradesh"))
	{
		Lily ly = ap. yourNationalFlower();
		
		System.out.println(ly.whatsYourName());
	}
	if(str.equals("Karnataka"))
	{
		Lotus l = k. yourNationalFlower();
		
		System.out.println(l.whatsYourName());
	}
	
	}

}





	

