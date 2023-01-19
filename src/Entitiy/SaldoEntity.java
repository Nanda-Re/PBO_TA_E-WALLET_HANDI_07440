package Entitiy;

public class SaldoEntity {
    private int saldo = 0;
    public SaldoEntity() {
    }

    public void tambahSaldo(int nominal) {
        saldo += nominal;
    }

    public boolean ambilSaldo (int nominal){
        if (saldo >= nominal){
            saldo -= nominal;
            return true;
        }
        return false;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


}
