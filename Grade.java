import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks :");
        int m = sc.nextInt();
        if(m>=90){
            System.out.println("Grade A");
        }
        else if(m>= 75 && m<=89){
            System.out.println("Grade B");
        }
        else if(m>= 60 && m<=74){
            System.out.println("Grade c");
        }
        else if(m>= 35 && m<=59){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
