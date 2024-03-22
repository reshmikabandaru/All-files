package com.aaslin.company;
class ROuter
{
  void Msg()
	{
		RInner s1 = new RInner();
				s1.Innermethod();
        }
	
      }	
class RInner{
	
	void Innermethod()
	{
		System.out.println("INNER CLASS METHOD INVOKED");
	}
	}
public class reshmika_task1 {
	public static void main(String[] args) {
		ROuter ro = new ROuter();
	//ROuter.RInner s1 = new ROuter.RInner();
		ro.Msg();
	}

}

