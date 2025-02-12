// write a program to check the voting Eligiblity using ternary operator

import java.util.Scanner;

class TernaryVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age for Voting :");
        int age = sc.nextInt();
    String res = age>=18?"Eligible":"Not Eligible";
    System.out.println(res);
    }
}
