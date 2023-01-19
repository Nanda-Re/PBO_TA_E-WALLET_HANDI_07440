package ViewGUI;

import Entitiy.DompetEntitiy;
import Entitiy.PulsaEntity;
import Entitiy.TransaksiEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import javax.swing.*;


public class HistoryFrame extends HomeFrame{
    private JLabel header;
    private JLabel transaksiuser;
    private JLabel pulsauser;
    private JLabel nominaluser;
    private JLabel bayaruser;
    private JLabel kodeVoucheruser;
    private JLabel tanggalTransaksi;
    private JLabel nominalTransaksi;
    private JButton buttonEXIT;

    UserEntitiy akun = UserModel.getUserHasLogin();
    DompetEntitiy dompet = akun.getDompet();
    public HistoryFrame(){
        super();
    }

    protected void component() {
        header = new JLabel("============TRANSAKSI============");
        header.setBounds(90,15,2000,30);
        add(header);

        for (TransaksiEntity transaksi : dompet.getListTransaksi()) {
            int b=50;

            if (transaksi instanceof PulsaEntity) {
                PulsaEntity pulsa = (PulsaEntity) transaksi;
                transaksiuser=new JLabel("Transaksi         : "+transaksi.getTglTrs());
                transaksiuser.setBounds(10,100,200,30);
                add(transaksiuser);

                pulsauser=new JLabel("pulsa                 : "+pulsa.getVcrPulsa().getTitle());
                pulsauser.setBounds(10,125,200,30);
                add(pulsauser);

                nominaluser=new JLabel("nominal             : "+Rupiah.format(pulsa.getVcrPulsa().getHarga()));
                nominaluser.setBounds(10,150,200,30);
                add(nominaluser);

                bayaruser=new JLabel("bayar                 : "+Rupiah.format(transaksi.getTotalPayment()));
                bayaruser.setBounds(10,175,200,30);
                add(bayaruser);

                kodeVoucheruser = new JLabel("Kode Voucher   : "+pulsa.getKodeVcr());
                kodeVoucheruser.setBounds(10,200,200,30);
                add(kodeVoucheruser);
            }
            else {
                tanggalTransaksi = new JLabel("Tanggal Transaksi : "+transaksi.getTglTrs());
                tanggalTransaksi.setBounds(10,50,200,30);
                add(tanggalTransaksi);

                nominalTransaksi = new JLabel("Nominal Transaksi: "+Rupiah.format(transaksi.getNominalHarga()));
                nominalTransaksi.setBounds(10,75,200,30);
                add(nominalTransaksi);
            }
        }
        buttonEXIT = new JButton("EXIT");
        buttonEXIT.setBounds(150,550,126,31);
        add(buttonEXIT);
    }

    protected void event() {
        buttonEXIT.addActionListener((e) -> {
            new HomeFrame().setVisible(true);
            dispose();
        });
    }
}
