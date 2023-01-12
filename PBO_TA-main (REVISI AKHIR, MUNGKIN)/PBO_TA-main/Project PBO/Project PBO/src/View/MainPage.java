package View;

import controller.controller_User;
import entity.entity_User;

import java.util.Scanner;

public class MainPage {
    controller_User User = new controller_User();
    Scanner input = new Scanner(System.in);

    void create() {
        User.create(new entity_User("NANDA", "itats", 101));
        User.create(new entity_User("APRILLIA", "itats", 102));
        User.create(new entity_User("ADMIN", "ADMIN", 103));
        User.create(new entity_User("ADMIN", "ADMIN", 104));

    }

    void read() {
        if (User.objUser.getdata_admin().size() > 0) {
            int nomorurut = 0;
            System.out.println("<<<<< DATA ADMIN >>>>>");
            for (int i = 0; i < User.objUser.getdata_admin().size(); i++) {
                nomorurut++;
                System.out.println("Admin " + nomorurut);
                System.out.println("Nama = " + User.objUser.getdata_admin().get(i).getNama());
                System.out.println("ID = " + User.objUser.getdata_admin().get(i).getId());
                System.out.println("=======================");
                System.out.println(" ");
            }
        } else {
            System.out.println("Data tidak ada");
        }
    }

    void update() {
        if (User.objUser.getdata_admin().size() > 0) {
            int nomor;
            read();
            System.out.println("Pilih index admin yang ingin diubah : ");
            nomor = input.nextInt();
            System.out.print("Masukkan nama baru : ");
            String Nama = input.next();
            System.out.print("Masukkan password baru : ");
            String Password = input.next();
            System.out.print("Masukkan id baru : ");
            int id = input.nextInt();
            input.nextLine();

            User.update(nomor - 1, new entity_User(Nama, Password, id));
            System.out.println("Data Admin pada index tersebut telah diubah");
        } else {
            System.out.println("Data kosong");
        }
    }

    void delete() {
        if (User.objUser.getdata_admin().size() > 0) {
            read();
            int nomor;
            System.out.println("pilih index admin yang ingin dihapus ");
            nomor = input.nextInt();

            User.delete(nomor - 1);
            System.out.println("Data berhasil dihapus ");
        } else {
            System.out.println("Data kosong");
        }
    }

    void login() {
        TopUpPage TopUp = new TopUpPage();
        TopUp.create();
        boolean cekLogin = false;

            System.out.print("Input Id : ");
            int id = input.nextInt();
            System.out.print("Input Pass : ");
            String password = input.next();
            for (int i = 0; i < User.objUser.getdata_admin().size(); i++) {
                if (id == User.objUser.getdata_admin().get(i).getId() && password.equals(User.objUser.getdata_admin().get(i).getPassword())) {
                    cekLogin = true;
                }
            }


        if (cekLogin) {
            System.out.println("Haloooo ADMIN");
            int pilih;
            do {
                System.out.println();
                System.out.println("<<< USER LOGGED IN >>>");
                System.out.println("1. Logged User Information");
                System.out.println("2. Update User Information");
                System.out.println("3. Hapus User");
                System.out.println("4. Top-Up");
                System.out.println("0. Back");
                System.out.print("Pilih: ");
                pilih = input.nextInt();
                System.out.println();

                switch (pilih) {
                    case 1 -> read();
                    case 2 -> update();
                    case 3 -> delete();
                    case 4 -> TopUp.menumobil();
                }
            } while (pilih != 0);
        }
        else {
            System.out.println("Id atau password salah");
            System.out.println();
        }
    }
}
