package main;

import controller.*;
import entity.*;

import java.util.Scanner;

class classkaryawan {
    controller_user karyawan = new controller_user();
    Scanner input = new Scanner(System.in);
    void createkaryawan() {

        System.out.print("Masukkan nama : ");
        String Nama = input.next();
        System.out.print("Masukkan alamat : ");
        String Alamat = input.next();
        System.out.print("Masukkan ttl : ");
        String Ttl = input.next();
        input.nextLine();

        karyawan.create(new entity_user(Nama, Alamat, Ttl));
        System.out.println("Data karyawan disimpan");
    }
    void login() {
        int i=1;
        System.out.println("test");
        String[] loguser = new String[7];
        System.out.println("LOGIN NAMA : ");
        loguser[i] = input.next();

            if (loguser[i]==karyawan.objkaryawan.getdata_karyawan().get(i).getNama())
            {
                System.out.println("login berhasil");
            }


    }

    void updatekaryawan() {
        if(karyawan.objkaryawan.getdata_karyawan().size()>0)
        {
            int nomor;
            login();
            System.out.println("Pilih index karyawan yang ingin diubah : ");
            nomor = input.nextInt();
            System.out.print("Masukkan nama baru : ");
            String Nama = input.next();
            System.out.print("Masukkan alamat baru : ");
            String Alamat = input.next();
            System.out.print("Masukkan ttl baru : ");
            String Ttl = input.next();
            input.nextLine();

            karyawan.update(nomor-1, new entity_user(Nama, Alamat,Ttl));
            System.out.println("Data karyawan telah diubah");
        } else {
            System.out.println("Data kosong");
        }
    }
    void deletekaryawan(){
        if(karyawan.objkaryawan.getdata_karyawan().size()>0)
        {
            login();
            int nomor;
            System.out.println("pilih index karyawan yang ingin dihapus ");
            nomor = input.nextInt();

            karyawan.delete(nomor);
            System.out.println("Data berhasil dihapus ");
        } else {
            System.out.println("Data kosong");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int pilih;
            do {
                classkaryawan obj1 = new classkaryawan();
                System.out.println("Pilih Packagemain.menu : ");
                System.out.println("1. Regist karyawan ");
                System.out.println("2. Login karyawan ");
                System.out.println("3. Exit");

                System.out.println("Pilih : ");
                pilih = input.nextInt();
                input.nextLine();
                switch (pilih) {
                    case 1:
                        obj1.createkaryawan();
                        break;

                    case 2:
                        obj1.login();
                        break;


                }
            } while (pilih != 3);

    }
}
