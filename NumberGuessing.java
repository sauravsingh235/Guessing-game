import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int SystemNum = (int)(Math.random()*100);
        int usernum = 0;

        do {
            System.out.println("Guess my num:");
            usernum = sc.nextInt();

            if (usernum == SystemNum){
                System.out.println("Woohoo! you win ");
                break;
            } else if (usernum > SystemNum) {
                System.out.println("you number is large");
            }
            else{
                System.out.println("you number is small");
            }
        }while (usernum >= 0);

        System.out.println("My number was :");
        System.out.println(SystemNum);


    }
}
