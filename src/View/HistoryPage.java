package View;

import Entitiy.DompetEntitiy;
import Entitiy.PulsaEntity;
import Entitiy.TransaksiEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

public class HistoryPage {

    public void historyTrs() {
        UserEntitiy akun = UserModel.getUserHasLogin();
        DompetEntitiy dompet = akun.getDompet();

        System.out.println("""
                    =======================
                    ==     TRANSAKSI     ==
                    =======================""");

        for (TransaksiEntity transaksi : dompet.getListTransaksi()) {
            if (transaksi instanceof PulsaEntity) {
                PulsaEntity pulsa = (PulsaEntity) transaksi;
                System.out.println("Transaksi                   = "+ transaksi.getTglTrs());
                System.out.println("Pulsa                       = Rp."+ pulsa.getVcrPulsa().getTitle());
                System.out.println("Nominal                     = Rp."+ Rupiah.format(pulsa.getVcrPulsa().getHarga()));
                System.out.println("Bayar                       = Rp."+ Rupiah.format(transaksi.getTotalPayment()));
                System.out.println("Kode Voucher                = "+ pulsa.getKodeVcr());
            }
            else {
                System.out.println("Tanggal Transaksi   = "+ transaksi.getTglTrs());
                System.out.println("Nominal Transaksi   = Rp."+ Rupiah.format(transaksi.getNominalHarga()));
            }
            System.out.println("========================================");
        }
        System.out.println();
        System.out.println();
    }
}
