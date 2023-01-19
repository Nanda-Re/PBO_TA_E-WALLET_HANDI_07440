package Entitiy;

import java.util.Scanner;
public class UserEntitiy {
    String nama;
    String username, password, no_Telp;
    String pin;
    DompetEntitiy dompet;

    Scanner input = new Scanner(System.in);

    public UserEntitiy(String nama, String username, String no_Telp, String pass, String pin) {
        this.nama = nama;
        this.username = username;
        password = pass;
        this.no_Telp = no_Telp;
        this.pin = pin;
        this.dompet = new DompetEntitiy();
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getNo_Telp() {
        return no_Telp;
    }

    public String getPassword() {
        return password;
    }

    public String getPin() {
        return pin;
    }

    public DompetEntitiy getDompet() {
        return dompet;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setNo_Telp(String no_Telp) {
        this.no_Telp = no_Telp;
    }

    public void setDompet(DompetEntitiy dompet) {
        this.dompet = dompet;
    }
}

