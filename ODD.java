import java.util.Scanner;
class OddEXception extends Exception{
    OddEXception(String message){
        System.out.println(message);
    }
}
public class ODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try{
            if(n%2!=0){
                throw new OddEXception("It is a odd number");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
