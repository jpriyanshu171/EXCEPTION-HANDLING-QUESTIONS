import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        System.out.println(message);
    }
}
public class AGE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("Underage for voting");
            }
            else{
                System.out.println("Eligible for voting");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
