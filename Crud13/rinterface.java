
	interface A1
	{
		abstract void method();
	}
	interface B1
	{
		abstract void method();
	}
	public class rinterface implements A1,B1
	{
		

		public static void main(String[] args) {
			rinterface mi = new rinterface();
		A1 i1 = new rinterface();
		B1 i2 = new rinterface();
		i1.method();
		i2.method();

		}

		@Override
		public void method() {
			System.out.println("welcome Reshmika");
		}

	}
