package demo;

public class Divisible8 {

	public static void main(String[] args) {
	
		int sum =0;
		int count =0;
		for( int i = 100;i <200;i++)
		{
			if( i%9 == 0)
			{
				sum = sum+i;
				count ++;
			}
		}
		System.out.println("sum of all interger"+sum);
        System.out.println("count of the integers"+count);
	}

}
