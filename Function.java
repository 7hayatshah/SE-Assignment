import java.util.*;

public class Function extends Random {

    //Method to search a number in the Array
    void search(int num, int Array[]){
        for(int i=0; i<Array.length; i++){
            if(num==Array[i]){
            System.out.println("Number: " + num + " is present at index " + i);
            break;
            }
            else if(i== Array.length-1)
            System.out.println("Number not found!");
        }
    }
    
    //Method to generate random numbers
    void generate(int Array[]){
        for(int i=0; i<Array.length; i++)
        Array[i] = nextInt(24) + 1;
    }

        //Bubble Sort
    void sort(int Array[]){
        for(int i= Array.length-1; i>=1; i--){
            for(int j=0; j<i; j++){
                if(Array[j]>Array[j+1]){
                int temp = Array[j+1];
                    Array[j+1] = Array[j];
                    Array[j] = temp;
                }
            }
        }
    }
}
