package ViewGUI;

import Controller.AuthorizationController;
import Controller.PulsaPurchaseController;
import Entitiy.PulsaEntity;
import Entitiy.UserEntitiy;
import Entitiy.VoucherPulsaEntitiy;
import Model.StorageModel;
import Model.UserModel;
import Utility.Rupiah;

import java.util.Scanner;

import javax.swing.*;

public class PulsaFrame extends HomeFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField pilihan;
    private JTextField pinuser;
    private JButton buttonpulsa;


    private JButton buttoneExit;

    JLabel welcome;
    JLabel money;
    UserEntitiy akun = UserModel.getUserHasLogin();
    int saldo = akun.getDompet().getSaldo().getSaldo();
    PulsaPurchaseController ppController = new PulsaPurchaseController();
    Scanner scan = new Scanner(System.in);

    public PulsaFrame(){
        super();
    }

    @Override
    protected void component() {

        welcome = new JLabel("<html>Welcome,<br> Your UWU Wallet</html>");
        setSize(welcome,20);
        boundedAdd(welcome,8,45,173,58);

        money = new JLabel("Rp."+ Rupiah.format(saldo));
        setSize(money,20);
        boundedAdd(money,8,119,126,31);

        //button menu awal
        label1 = new JLabel("1. VOUCHER 10.000 Rp. 11.500");
        label1.setBounds(125,130,200,31);
        add(label1);

        label2 = new JLabel("2. VOUCHER 15.000 Rp. 16.500");
        label2.setBounds(125,150,200,31);
        add(label2);

        label3 = new JLabel("3. VOUCHER 20.000 Rp. 21.500");
        label3.setBounds(125,170,200,31);
        add(label3);

        label4 = new JLabel("4. VOUCHER 25.000 Rp. 26.500");
        label4.setBounds(125,190,200,31);
        add(label4);

        label5 = new JLabel("5. VOUCHER 40.000 Rp. 41.500");
        label5.setBounds(125,210,200,31);
        add(label5);

        label6 = new JLabel("6. VOUCHER 50.000 Rp. 51.500");
        label6.setBounds(125,230,200,31);
        add(label6);

        label7 = new JLabel("7. VOUCHER 75.000 Rp. 76.500");
        label7.setBounds(125,250,200,31);
        add(label7);

        label8 = new JLabel("8. VOUCHER 100.000 Rp. 100.000");
        label8.setBounds(125,270,200,31);
        add(label8);

        label9 = new JLabel("PILIH ANGKA (1-8) : ");
        label9.setBounds(125,300,200,30);
        add(label9);

        pilihan = new JTextField();
        pilihan.setBounds(125,330,50,30);
        add(pilihan);

        label10 = new JLabel("MASUKKAN PIN : ");
        label10.setBounds(125,360,200,30);
        add(label10);

        pinuser = new JTextField();
        pinuser.setBounds(125,390,50,30);
        add(pinuser);

        buttonpulsa = new JButton("CONFIRM");
        buttonpulsa.setBounds(125,420,100,30);
        add(buttonpulsa);

        buttoneExit = new JButton("EXIT");
        buttoneExit.setBounds(150,550,126,31);
        add(buttoneExit);
    }


    @Override
    protected void event() {
        PulsaPurchaseController ppController = new PulsaPurchaseController();
        Scanner scan = new Scanner(System.in);
        buttonpulsa.addActionListener((e -> {
            int pilih = Integer.parseInt(pilihan.getText());
            StorageModel.getItemPulsa();
            UserEntitiy akun = UserModel.getUserHasLogin();

            if (pilih > StorageModel.getItemPulsa().size()) {}
            else {
                VoucherPulsaEntitiy pulsa = StorageModel.getItemPulsa().get(pilih - 1);
                int totalBayar =  pulsa.getHarga();

                int test = 3;
                    String pin = pinuser.getText();

                    if (AuthorizationController.verifPin(pin)) {
                        if (akun.getDompet().getSaldo().getSaldo() >= totalBayar){
                            PulsaEntity newTrs = new PulsaEntity(pulsa, totalBayar);
                            ppController.pulsaPurchase(akun, newTrs);
                            System.out.println();
                        }
                    }
            }
        }));
            buttoneExit.addActionListener((e) -> {
                new HomeFrame().setVisible(true);
                dispose();
            });

    }
}