package authentication;


import java.util.Scanner;

public class User_Authentication
{
    public static void main(String args[])
    {
        String username;
               String password;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        username = s.next();
        System.out.println("Enter password:");
        password = s.next();
        if(username.equals("Umar901") && password.equals("@Umar901"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
    }
}