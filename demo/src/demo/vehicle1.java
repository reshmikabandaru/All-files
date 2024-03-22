package demo;

abstract class abs {
public char[] car;
abstract	void bike();
abstract	void car();
	
}
abstract class vechile1 extends abs
{
	void bike() {
		System.out.println("YAMAHA");
	}
	void car() {
		System.out.println("SUPRA");
		System.out.println(super.car);
	}
}
class vechicleex2 extends vechile1
{
	public static void main(String[] args) {
		vechicleex2 ob = new vechicleex2();
	     ob.bike();
	     ob.car();
	}
}
	


