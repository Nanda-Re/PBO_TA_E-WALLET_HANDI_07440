package ViewGUI;

import Controller.TopUpController;
import Entitiy.TopUpEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import javax.swing.*;
import java.util.Scanner;
public class TopUpFrame extends HomeFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField topup;
    private JButton buttonConfirm;
    private JButton buttonEXIT;

    UserEntitiy akun = UserModel.getUserHasLogin();
    int saldo = akun.getDompet().getSaldo().getSaldo();

    public TopUpFrame(){
        super();
    }

    @Override
    protected void component() {

        //label menu awal
        label1 = new JLabel("================");
        label1.setBounds(150,10,126,31);
        add(label1);

        label2 = new JLabel("=====TOP-UP=====");
        label2.setBounds(150,30,126,31);
        add(label2);

        label3 = new JLabel("================");
        label3.setBounds(150,50,126,31);
        add(label3);

        label4 = new JLabel("MASUKKAN NOMINAL");
        label4.setBounds(150,200,126,31);
        add(label4);

        topup = new JTextField();
        topup.setBounds(150,240,126,31);
        add(topup);

        buttonConfirm = new JButton("CONFIRM");
        buttonConfirm.setBounds(150,280,126,31);
        add(buttonConfirm);

        buttonEXIT = new JButton("EXIT");
        buttonEXIT.setBounds(150,550,126,31);
        add(buttonEXIT);
    }


    @Override
    protected void event() {
        buttonConfirm.addActionListener((e) -> {
            TopUpController topUpController = new TopUpController();
            Scanner scan = new Scanner(System.in);
            int nominal = Integer.parseInt(topup.getText());
            if (nominal >= 10000) {
                TopUpEntity topUp = new TopUpEntity(nominal);
                topUpController.topUp(akun, topUp);
            }
        });


        buttonEXIT.addActionListener((e) -> {
                new HomeFrame().setVisible(true);
                dispose();
        });
    }

}

