package Entitiy;
import Utility.Date;

public abstract class TransaksiEntity {
    private String jenisTrs;
    private String tglTrs;
    public int nominalHarga;
    public int totalPayment;

    public TransaksiEntity(String jenisTrs, int nominalHarga, int totalPayment) {
        this.jenisTrs = jenisTrs;
        this.nominalHarga = nominalHarga;
        this.totalPayment = totalPayment;
        this.tglTrs = Date.now();
    }

    public void dataTransaksi() {
        System.out.println("Jenis Transaksi     = " + jenisTrs);
        System.out.println("Tanggal Transaksi   = " + tglTrs);
        System.out.println("Nominal Harga       = " + nominalHarga);
        System.out.println("Total Bayar         = " + totalPayment);
    }

    public String getJenisTrs() {
        return jenisTrs;
    }

    public void setJenisTrs(String jenisTrs) {
        this.jenisTrs = jenisTrs;
    }

    public String getTglTrs() {
        return tglTrs;
    }

    public void setTglTrs(String tglTrs) {
        this.tglTrs = tglTrs;
    }

    public abstract int getNominalHarga();

    public void setNominalHarga(int nominalHarga) {
        this.nominalHarga = nominalHarga;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }
}
