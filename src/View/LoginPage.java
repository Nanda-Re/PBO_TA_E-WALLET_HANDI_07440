package View;

import Controller.AuthorizationController;

import java.util.Scanner;

public class LoginPage {
    Scanner input = new Scanner(System.in);
    AuthorizationController auth = new AuthorizationController();
    public LoginPage() {
        loginMenu();
    }

    void loginMenu() {
        String username, password;
        boolean status = false;

        do {
            System.out.println("~~~~~~~LOGIN~~~~~~~");

            System.out.print("Username    = ");
            username = input.nextLine();

            System.out.print("Password    = ");
            password = input.nextLine();

            status = auth.login(username, password);

            if (status) {
                System.out.println("Anda telah masuk");
                System.out.println();
                new MainAppPage();
                break;
            }
            else {
                System.out.println("Username atau password yang anda masukkan salah");
                System.out.println();
            }
        }while (status == false);
    }
}
