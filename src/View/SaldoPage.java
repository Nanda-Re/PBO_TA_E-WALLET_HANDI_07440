package View;

import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

public class SaldoPage {
    public SaldoPage() {
        cekSaldo();
    }

    private void cekSaldo() {
        System.out.println("""
                    =======================
                    ==     CEK SALDO     ==
                    =======================""");
        UserEntitiy akun = UserModel.getUserHasLogin();

        int saldo = akun.getDompet().getSaldo().getSaldo();
        int income = akun.getDompet().getPemasukan();
        int outcome = akun.getDompet().getPengeluaran();
        System.out.println("Total Saldo             = Rp." + Rupiah.format(saldo));
        System.out.println("Pemasukan               = Rp." + Rupiah.format(income));
        System.out.println("Pengeluaran             = Rp." + Rupiah.format(outcome));
        System.out.println();
        System.out.println("Ketik 0 untuk kembali ke menu");
    }
}
