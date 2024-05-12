import java.util.*;

public class Main{
    public static void main(String[] args) {
        //Creating Objects
		Scanner ob=new Scanner(System.in);
		Function fs = new Function();

		//Creating An Array and filling it with random numbers!
		int[] num = new int[10];
		fs.generate(num);
		System.out.println("- Array filled Random Numbers between 1 to 25!");

		boolean a = true;
		while(a){
		//Using switch to let user choose what he wants to do!
		System.out.println("- Press the number related to your desired function!");
		System.out.println("Display: 1 \nSearch:  2 ");
		switch(ob.nextInt()){
			
		case 1:
		//Display Array Contents
		for(int i=0; i<10; i++)
		System.out.println(num[i]);
		break;

		case 2:
		//Searching
		System.out.println("Insert the number you want to search");
		fs.search(ob.nextInt(), num);
		break;
		}

		//Taking user input to see if he wants to continue
		System.out.println("\nPress '0' if you want to exit or other number if you want to continue...");
		if(ob.nextInt()==0)
			break;
	}
}
}
