// Write a program to check if a student pass or fail

import java.util.Scanner;
 class Pass {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Marks: ");
    int res = sc.nextInt();
    if (res >= 35) {
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }
}
    
}