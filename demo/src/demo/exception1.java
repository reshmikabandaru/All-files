package demo;
 class exception1 {
	
	
		void show()
		{
			System.out.println("it is aparent class");
			
		}
 }
 class exception2 extends exception1
	{
		void showdata()
		{
			System.out.println("it is achild class");
		}
	}
	

 	class noclassdeffoundexception{
	
		public static void main (String args[])
		{
			exception2 data = new exception2();
			data.showdata();
			data.show();
		}
	}




