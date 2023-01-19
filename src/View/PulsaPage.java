package View;

import Controller.AuthorizationController;
import Controller.PulsaPurchaseController;
import Entitiy.PulsaEntity;
import Entitiy.UserEntitiy;
import Entitiy.VoucherPulsaEntitiy;
import Model.StorageModel;
import Model.UserModel;
import Utility.Rupiah;

import java.util.Scanner;

public class PulsaPage {
    PulsaPurchaseController ppController = new PulsaPurchaseController();
    Scanner scan = new Scanner(System.in);
    public PulsaPage(){
        pembeliPulsa();
    }
    private void pembeliPulsa(){
        StorageModel.getItemPulsa();
        UserEntitiy akun = UserModel.getUserHasLogin();
        int pilih = -1;

        do {
            System.out.println("""
                    =========================
                    ==   PEMBELIAN PULSA   ==
                    =========================""");
            System.out.println("Ketikkan -1 untuk pembatalan");
            StorageModel.seeItemPulsa();
            System.out.println("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();

            if (pilih == -1){
                System.out.println("Proses Pembelian Entitiy.Pulsa Dibatalkan");
                break;
            }

            if (pilih > StorageModel.getItemPulsa().size()) {
                System.out.println("""
                        Nominal yang anda masukkan tidak ada
                        Mohon masukkan nominal dengan benar
                        """);
                System.out.println();
            }
            else {
                VoucherPulsaEntitiy pulsa = StorageModel.getItemPulsa().get(pilih - 1);
                int totalBayar =  pulsa.getHarga();

                int test = 3;
                do {
                    System.out.println("Masukkan PIN anda : ");
                    String pin = scan.nextLine();

                    if (AuthorizationController.verifPin(pin)) {
                        if (akun.getDompet().getSaldo().getSaldo() >= totalBayar){
                            PulsaEntity newTrs = new PulsaEntity(pulsa, totalBayar);

                            ppController.pulsaPurchase(akun, newTrs);
                            System.out.println("Voucher pulsa senilai Rp." + Rupiah.format(pulsa.getHarga()));
                            System.out.println("Voucher         : " + pulsa.getTitle());
                            System.out.println("Harga           : Rp." + Rupiah.format(pulsa.getHarga()));
                            System.out.println("Total           : Rp." + Rupiah.format(totalBayar));
                            System.out.println("Kode Voucher    : " + newTrs.getKodeVcr());
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            scan.nextLine();
                            System.out.println();
                            break;
                        }
                        else {
                            System.out.println("Entitiy.Saldo kurang!!");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Ingin melanjutkan ? ");
                            scan.nextLine();
                            System.out.println();
                            break;
                        }
                    }
                    else {
                        test -= 1;
                        System.out.println("PIN tidak valid");
                        if (test == 0) {
                            System.out.println("Anda telah gagal sebanyak 3x");
                            System.out.println("Silahkan coba lagi");
                            System.out.println();
                            break;
                        }
                        System.out.println();
                    }
                }
                while (test > 0);
            }
        }
        while (pilih != -1);
    }
}
