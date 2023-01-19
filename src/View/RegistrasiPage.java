package View;

import Controller.AuthorizationController;
import Entitiy.UserEntitiy;

import java.util.Scanner;

public class RegistrasiPage {
    private Scanner input = new Scanner(System.in);
    AuthorizationController auth = new AuthorizationController();
   public void registrasiMenu() {
        String nama, username, password, noTelp, pin;

        do {
            System.out.println("~~~~~~Pendaftaran Akun~~~~~~");
            System.out.print("Nama        = ");
            nama = input.nextLine();

            System.out.print("Username    = ");
            username = input.nextLine();

            System.out.print("No.Telp     = ");
            noTelp = input.nextLine();

            System.out.print("Password    = ");
            password = input.nextLine();

            System.out.print("PIN         = ");
            pin = input.nextLine();

            UserEntitiy newUserEntitiy = new UserEntitiy(nama, username, noTelp, password, pin);

            if (auth.regis(newUserEntitiy)) {
                System.out.println("Akun anda berhasil dibuat");
                break;
            }
            else {
                System.out.println("Akun anda telah terdaftar");
                System.out.println();
            }
        }while (true);
    }
}
