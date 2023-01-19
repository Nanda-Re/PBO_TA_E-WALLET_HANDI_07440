package Entitiy;

import java.util.ArrayList;

public class DompetEntitiy {
    int pemasukan = 0;
    int pengeluaran = 0;
    private SaldoEntity saldo = new SaldoEntity();
    private ArrayList<TransaksiEntity> listTransaksi = new ArrayList<>();

    public DompetEntitiy() {
    }

    public DompetEntitiy(int income) {
        this.pemasukan = income;
    }

    public void tambahTrs(TransaksiEntity transaksi){
        if (transaksi instanceof TopUpEntity){
            pemasukan += transaksi.nominalHarga;
        }
        else {
            pengeluaran += transaksi.totalPayment;
        }
        listTransaksi.add(transaksi);
    }

    public int getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(int pemasukan) {
        this.pemasukan = pemasukan;
    }

    public int getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(int pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public SaldoEntity getSaldo() {
        return saldo;
    }

    public void setSaldo(SaldoEntity saldo) {
        this.saldo = saldo;
    }

    public ArrayList<TransaksiEntity> getListTransaksi() {
        return listTransaksi;
    }

    public void setListTransaksi(ArrayList<TransaksiEntity> listTransaksi) {
        this.listTransaksi = listTransaksi;
    }
}
