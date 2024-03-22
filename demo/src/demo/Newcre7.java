package demo;

class vehicle1 {
	void bike()
	{
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine");
	
	}
	
}
 class abs extends vehicle1
{
	 void bike()
		{
			System.out.println("My ancestor is a cycle who is a vehicle with pedals" );			
		}

 public static void main(String[] args) {
	 vehicle1 ob = new vehicle1();
	 ob.bike();
	}
}
 


