package View;

import java.util.Scanner;

public class HomePage {
    private Scanner input = new Scanner(System.in);
    public void run() {
        String loginPage = """
            =================================
                  WELCOME TO UWU WALLET
            =================================
            1. Login
            2. Register
            3. Keluar
            """;

        int menu;

        do{
            System.out.println(loginPage);
            System.out.print("Pilih: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    new LoginPage().loginMenu();
                    break;
                case 2:
                    new RegistrasiPage().registrasiMenu();
                    break;
                case 3:
                    System.out.println("Keluar dari aplikasi");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak benar");
                    break;
            }
            System.out.println();
        }while (menu != 3);
    }
}
