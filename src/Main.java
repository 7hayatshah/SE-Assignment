import java.util.*;

public class Main{
    public static void main(String[] args) {
        //Creating Objects
		Scanner ob=new Scanner(System.in);
		Function fs = new Function();

		//Creating An Array and filling it with random numbers!
		int[] num = new int[10];
		fs.generate(num);
		System.out.println("Array filled random Numbers between 1 to 25!");

		boolean a = true;
		while(a){
		//Using switch to let user choose what he wants to do!
		System.out.println("Press the number related to your desired function!");
		System.out.println("Display: 1 \nSearch:  2 \nSort:    3 \nInsert:  4");
		switch(ob.nextInt()){
			
		case 1:
		//Display Array Contents
		System.out.println("Array Contents:");
		for(int i=0; i<10; i++)
		System.out.println(num[i]);
		break;

		case 2:
		//Searching
		System.out.println("Insert the number you want to search");
		fs.search(ob.nextInt(), num);
		break;
		
		case 3:
		//Sorting
		System.out.println("Array Succesfully Sorted!");
		fs.sort(num);
		break;

		case 4:
		//Insertion
		System.out.println("Insert the number:");
		fs.insert(ob.nextInt(), num);
		break;

		default:
		System.out.println("Invalid!");
		}

		//Taking user input to see if he wants to continue
		System.out.println("\nPress '0' for exit or 'other number' if you want to continue...");
		if(ob.nextInt()==0)
		break;
	}
}
}
