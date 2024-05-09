import java.util.*;

public class Main{
    public static void main(String[] args) {
        //Creating Objects
		Scanner ob=new Scanner(System.in);
		Function fs = new Function();

			//Creating An Array and input number
			System.out.println("Enter 10 num");
			int num[]=new int[10];
			for(int i=0; i<10; i++){
				num[i]=ob.nextInt();
				}

			//Using switch to let user choose what he wants to do!
			switch(ob.nextInt()){
				case 1: 
				//Display Array Contents
				for(int j=0; j<10; j++)
				System.out.println(num[j]);
				break;
					//searching
			case 2: 
			System.out.println("Enter num");
			int n=ob.nextInt();
			for(int k=0; k<10; k++){
					//find the location of input number  
				if(num[k]==n){
					System.out.println("loction is:"+k);
					break;
				}
			}
			break;
			}
	}
}