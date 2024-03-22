import java.util.Scanner;

public class project {
    public static void main (String[] args) {
        System.out.println("Welcome to our food application");
        System.out.println("please create your Account");

        System.out.println("Please create your Email");
        Scanner scan = new Scanner(System.in);
        String email1 = scan.next();

        System.out.println("Please create your password");

        String  pass1 = scan.next();

        System.out.println("Your email is: " + email1);
        System.out.println("your password is: " + pass1);

        System.out.println("Please enter your email");
        String email = scan.next();

        while (!email.equals(email1)) {
            System.out.println("Incorrect email, \n please try again: ");
            email = scan.next();
        }


        System.out.println("Please enter your password: ");System.out.println(" a nice day");
        String pass = scan.next();Have

        while (!pass.equals(pass1)) {
            System.out.println("this is not the right password, try again: ");
            pass = scan.next();
        }

        System.out.println("you are logged in");
        System.out.println("Are you hungry yes or no");
        String ans = scan.next();

        if (ans.equals("yes")) {
            System.out.println("Do you want a pizza, hamburger or fish ");
            String ans1 = scan.next();

            while (!ans1.equals("pizza") && !ans1.equals("hamburger") && !ans1.equals("fish")) {
                System.out.println("sorry we do not have it, what will you like between pizza, hamburger, fish");
                ans1 = scan.next();
            }

            if (ans1.equals("pizza") || ans1.equals("hamburger") || ans1.equals("fish")) {
                System.out.println("Do you want something to drink? yes or no : ");
                String ans2 = scan.next();

                while (!ans2.equals("yes") && !ans2.equals("no")) {
                    System.out.println("wrong command, try again");
                    ans2 = scan.next();
                }

                if (ans2.equals("yes")) {
                    System.out.println("what would you like to drink, a coke or juice");
                    String ans3 = scan.next();

                    while (!ans3.equals("coke") && !ans3.equals("juice"))  {
                        System.out.println("we do not have this drink");
                        ans3 = scan.next();
                    }

                    if (ans3.equals("coke") || ans3.equals("juice")) {
                        System.out.println("you have order "+ ans1 + " and "+ ans3);
                    }
                } else if (ans2.equals("no")) {
                    System.out.println("you have order "+ ans1);
                }

            }
            System.out.println("Please sign out with your password ");
            pass = scan.next();
    
            while (!pass.equals(pass1)) {
                System.out.println("wrong pass word \n try again");
                pass = scan.next();
            }
    
            System.out.println("thank you your order is on it way");
    
        }
        else {
            System.out.println("Please sign out with your password ");
            pass = scan.next();
    
            while (!pass.equals(pass1)) {
                System.out.println("wrong pass word \n try again");
                pass = scan.next();
        }
        System.out.println("Have a nice day");
    }
}

}
