import java.util.Scanner;

public class ArrayFunctions{
    public static void main(String[] args) {
        //scanner class
		Scanner ob=new Scanner(System.in);
		int  a=0;
		do{
					//Creating An Array and input number
			System.out.println("Enter 10 num");
			int num[]=new int[10];
			for(int i=0; i<10; i++){
				num[i]=ob.nextInt();
				}
					//Taking selection
			System.out.println("selection \n 1.Travrse Array \n 2.search no.");
			int sel=ob.nextInt();
					//used switch to add multiple slection
			a=sel;
			switch(sel){
				case 1: 
					// Read/Travrse/ output value
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
		}while(a>=1 && a<=3);
	}
}