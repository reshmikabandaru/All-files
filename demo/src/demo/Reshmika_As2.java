package demo;

class vehicleSuper1 {

     void bike()
		{
			System.out.println("Hello I am a motorcycle, I am a cycle with an engine");
		}
	}

class motorcycle extends vehicleSuper1
{
	
 void bike()
   {
   System.out.println("My ancestor is a cycle who is a vehicle with pedals" );
   }		
  void bike1()
   {
	  super.bike();
	  bike();
    }
  }
class Reshmika_As2{
	 public static void main(String[] args) {
	 motorcycle ob = new motorcycle();
	 ob.bike1();	 
	 }

}


