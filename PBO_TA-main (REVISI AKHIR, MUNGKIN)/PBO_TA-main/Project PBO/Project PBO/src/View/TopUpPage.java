package View;

import Utility.Date;
import Utility.Rupiah;
import controller.controller_TopUp;
import entity.entity_TopUp;

import java.util.Scanner;

public class TopUpPage {
    controller_TopUp TopUp = new controller_TopUp();
    Scanner input = new Scanner(System.in);

    void create() {
        TopUp.create(new entity_TopUp("Dana10", "Saldo", 10500));
        TopUp.create(new entity_TopUp("Dana30", "Saldo", 30500));
        TopUp.create(new entity_TopUp("Dana50", "Saldo", 50500));
        TopUp.create(new entity_TopUp("Steam10", "Voucher", 15000));
        TopUp.create(new entity_TopUp("Steam30", "Voucher", 35000));
        TopUp.create(new entity_TopUp("Steam50", "Voucher", 55000));
        TopUp.create(new entity_TopUp("Telkomsel10", "Pulsa", 11000));
        TopUp.create(new entity_TopUp("Telkomsel30", "Pulsa", 31000));
        TopUp.create(new entity_TopUp("Telkomsel50", "Pulsa", 51000));

    }

    private void read() {
        System.out.println("List Mobil yang tersedia");
            System.out.println("===============================");
            for (int i = 0; i < TopUp.objTopUp.getData_TopUp().size(); i++) {
                System.out.println("Nama Top-Up  = " + TopUp.objTopUp.getData_TopUp().get(i).getNama_TopUp());
                System.out.println("Jenis Top-Up = " + TopUp.objTopUp.getData_TopUp().get(i).getJenis());
                System.out.println("Harga = Rp." + Rupiah.format(TopUp.objTopUp.getData_TopUp().get(i).getHarga()));
                System.out.println("===============================");
            }

    }

    void beli() {
        read();
        System.out.println();
        System.out.print("Masukkan Nama Top-Up : ");
        String nama = input.next();
        input.nextLine();
        boolean cekbeli = false;
        char dcs = 'y';
        for (int i = 0; i < TopUp.objTopUp.getData_TopUp().size(); i++) {
            if (nama.equals(TopUp.objTopUp.getData_TopUp().get(i).getNama_TopUp())) {
                cekbeli = true;
                System.out.println("ditemukan");
                System.out.print("Apakah anda ingin melakukan Top-Up ini (y/n) ? :");
                dcs = input.nextLine().charAt(0);
                if (cekbeli && dcs == 'y') {
                    System.out.println("Mobil berhasil dibeli dengan rincian ");
                    for (i = 0; i < TopUp.objTopUp.getData_TopUp().size(); i++) {
                        if (nama.equals(TopUp.objTopUp.getData_TopUp().get(i).getNama_TopUp())) {
                            cekbeli = true;
                            System.out.println("=====================================================");
                            System.out.println("NAMA Top-Up       : " + TopUp.objTopUp.getData_TopUp().get(i).getNama_TopUp());
                            System.out.println("HARGA             : Rp. " + Rupiah.format(TopUp.objTopUp.getData_TopUp().get(i).getHarga()));
                            System.out.println("JENIS             : " + TopUp.objTopUp.getData_TopUp().get(i).getJenis());
                            System.out.println("TANGGAL PEMBELIAN : " + Date.now());
                            System.out.println("=====================================================");
                        }
                    }
                } else {
                    System.out.println("Pembelian dibatalkan");
                    System.out.println();
                }
            } else {
                System.out.println("Tidak Ditemukan");
                System.out.println();
            }
        }
    }

    void menumobil() {
        int pilih;
        do {
            System.out.println("<<< Top Up >>>");
            System.out.println("1. Purchase E-Wallet ");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (pilih) {
                case 1 -> {beli();}
            }
        } while (pilih != 1);
    }
}
