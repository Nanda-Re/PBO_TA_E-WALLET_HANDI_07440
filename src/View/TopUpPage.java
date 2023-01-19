package View;

import Controller.TopUpController;
import Entitiy.TopUpEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import java.util.Scanner;

public class TopUpPage {
    TopUpController topUpController = new TopUpController();
    Scanner scan = new Scanner(System.in);
    public TopUpPage() {
        menuTopUp();
    }
    private void menuTopUp() {
        UserEntitiy akun = UserModel.getUserHasLogin();

        int nominal = 0;
        do {
            System.out.println("""
                    ========================
                    ==       TOP UP       ==
                    ========================""");
            System.out.println("Masukkan -1 untuk pembatalan");

            System.out.print("Masukkan Nominal Rp. ");
            nominal = scan.nextInt();
            scan.nextLine();

            if (nominal >= 10000) {
                TopUpEntity topUp = new TopUpEntity(nominal);
                topUpController.topUp(akun, topUp);

                System.out.printf("Top up senilai Rp.%s telah berhasil\n", Rupiah.format(nominal));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ingin melanjutkan?");
                scan.nextLine();
                System.out.println();
                break;
            }
            else {
                System.out.println("Tup Up minimal Rp.10,000");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
            }
        }while (nominal != -1);
    }
}
