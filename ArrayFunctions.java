import java.util.Scanner;

public class ArrayFunctions{
    public static void main(String[] args) {
        //Creating An Array
        Scanner ob=new Scanner(System.in);
		System.out.println("Enter 10 num");
		int num[]=new int[10];
		for(int i=0; i<10; i++){
			num[i]=ob.nextInt();
		}

    }
}
