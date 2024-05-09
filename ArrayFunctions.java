import java.util.Scanner;

public class ArrayFunctions{
    public static void main(String[] args) {
        //Creating An Array
		int num[] = new int[10];

		//Creating Objects
        Scanner ob = new Scanner(System.in);

		//Taking Input
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<10; i++){
			num[i] = ob.nextInt();
		}

    }
}
