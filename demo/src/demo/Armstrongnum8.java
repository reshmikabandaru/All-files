package demo;

import java.util.*;
import java.math.*;

public class Armstrongnum8 {

	static boolean isArmstrong(int n) {
		int temp;
		int rem;
		int sum = 0;

		temp = n;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}

		if (n == sum) {
			return true;

		} else {
			return false;

		}
	}

	public static void main(String[] args) {
		
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit ");
		num = sc.nextInt();
		System.out.println("the armstrong numbers are   " + num);
		for (int i = 0; i <= num; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + ",");
			}
		}

	}
}