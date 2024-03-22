package demo;


interface A1
{
	abstract void method();
}
interface B1
{
	abstract void method();
}
public class multipleInterfaces7 implements A1,B1
{
	

	public static void main(String[] args) {
		multipleInterfaces7 mi = new multipleInterfaces7();
	A1 i1 = new multipleInterfaces7();
	B1 i2 = new multipleInterfaces7();
	i1.method();
	i2.method();

	}

	@Override
	public void method() {
		System.out.println("welcome");
	}

}
