package Arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //class of 500 students; - you have to store marks of these 500 students
        //use Arrays

        int marks[] = new int[7];
        //memory allocation


        //accessing elements
        Scanner sc = new Scanner(System.in);
        for(int  i =  0  ;  i < marks.length ; i++){
            System.out.println("enter the " + i + " th element this array: ");
            marks[i] = sc.nextInt();

        }
        //printing the array
        for(int i =  0  ; i < marks.length ; i++){
            System.out.print (marks[i] + " ");
        }


    }
}
