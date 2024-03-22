package com.aaslin.company;

interface shape{
	
	interface drawable{
		void draw(); 
		
}
}

class circle implements  shape ,shape.drawable
{
	public void draw()
	{
		System.out.println("CIRCLE");	
	}

}
class rectangle implements shape,shape.drawable
{
    public void draw() {
		System.out.println("RECTANGLE");
	}
	
}


public class reshmika_task6 {
	public static void main(String[] args) {
		circle cr = new circle();
		rectangle re = new rectangle();
		
		cr.draw();
		re.draw();
		
	}

}
