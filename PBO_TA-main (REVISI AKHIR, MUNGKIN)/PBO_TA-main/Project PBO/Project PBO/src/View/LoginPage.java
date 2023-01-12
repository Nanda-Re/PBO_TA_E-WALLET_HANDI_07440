package View;

import javax.swing.JTextField;
import java.util.Scanner;

public class LoginPage {
    Scanner input = new Scanner(System.in);

    public void Pilihmenu() {
        MainPage admin = new MainPage();
        TopUpPage mobil = new TopUpPage();
        admin.create();
        mobil.create();

        int pilihan;
        do {
            System.out.println("============");
            System.out.println("1. LOGIN ");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1 -> admin.login();
            }
        } while (pilihan != 0);
    }
}
