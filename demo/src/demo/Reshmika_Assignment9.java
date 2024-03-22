package demo;
import java.util.*;

class Reshmika_Assignment9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 Integers....");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Integer " + i + " : ");
            arr[i - 1] = s.nextInt();
        }
        for (int i = 0; i < 5; i++)
            checkPrimeNum(arr, i);
    }

    public static void checkPrimeNum(int[] arr, int index) {
        char flag = 'n';
        for (int i = 2; i <= arr[index] / 2; i++) {
            if (arr[index] % i == 0) {
                flag = 'y';
                break;
            }
        }
        if (flag == 'n') {
            for (int j = 0; j <= index; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}