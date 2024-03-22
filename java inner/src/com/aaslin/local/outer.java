package com.aaslin.local;

public class outer {
	void Innermethod()
	{
		class Inner {
			void message()
			{
				System.out.println("local inner class");
			}
			
		}
		
		Inner inner =new Inner();
		inner.message();
	}
		public static void main(String[] args) {
			outer outer = new outer();
			outer.Innermethod();
		}
		
	}


