package View;

import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import java.util.Scanner;

public class MainAppPage {
    private Scanner scan = new Scanner(System.in);

    public MainAppPage(){
        runMain();
    }

    private void runMain(){
        UserEntitiy akun = UserModel.getUserHasLogin();


        String homePage = """
                Your UWU WALLET  
                Rp.""";

        String pilih = """ 
                1. Top Up
                2. Beli Pulsa
                3. Riwayat Transaksi
                0. Logout
                """;

        int menu;

        do{
            System.out.print(homePage);
            int saldo = akun.getDompet().getSaldo().getSaldo();
            System.out.println(Rupiah.format(saldo));
            System.out.println();
            System.out.println(pilih);
            System.out.print("Pilih : ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 0 ->{
                    System.out.println();
                    System.out.println("Ada telah keluar");
                    new HomePage().run();
                }
                case 1 ->{
                    new TopUpPage();
                }
                case 2 -> {
                    new PulsaPage();
                }
                case 3 ->{
                    new HistoryPage().historyTrs();
                }
            }
        }while (menu != 0);
    }
}
