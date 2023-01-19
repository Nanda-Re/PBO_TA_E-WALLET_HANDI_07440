package ViewGUI;

import Entitiy.UserEntitiy;
import Model.*;
import Utility.Rupiah;
import View.TopUpPage;

import javax.swing.*;

public class HomeFrame extends MainFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    JLabel welcome;
    JLabel money;
    UserEntitiy akun = UserModel.getUserHasLogin();
    int saldo = akun.getDompet().getSaldo().getSaldo();

    public HomeFrame(){
        super("Home Menu", 656,444);
    }

    @Override
    protected void component() {
        welcome = new JLabel("<html>Welcome,<br> Your UWU Wallet</html>");
        setSize(welcome,20);
        boundedAdd(welcome,8,45,173,58);

        money = new JLabel("Rp."+ Rupiah.format(saldo));
        setSize(money,20);
        boundedAdd(money,8,119,1260,31);

        //button menu awal
        button1 = new JButton("TOP-UP");
        button1.setBounds(150,160,126,31);
        add(button1);

        button2 = new JButton("BELI PULSA");
        button2.setBounds(150,220,126,31);
        add(button2);

        button3 = new JButton("HISTORY");
        button3.setBounds(150,280,126,31);
        add(button3);

        button4 = new JButton("EXIT");
        button4.setBounds(150,550,126,31);
        add(button4);
    }


    //        masukButton.addActionListener((e) -> {
//            String username = usernameField.getText();
//            String pass = passwordField.getText();
//            boolean login = authCon.login(username,pass);
//            if(login){
//                new HomeFrame().setVisible(true);
//                dispose();
//            }
//            else {
//                JOptionPane.showMessageDialog(null,"Username atau password salah","Allert!!",JOptionPane.ERROR_MESSAGE);
//            }
//        });

    @Override
    protected void event() {
        button1.addActionListener((e -> {
            new TopUpFrame().setVisible(true);
            dispose();
        } ));

        button2.addActionListener((e -> {
            new PulsaFrame().setVisible(true);
            dispose();
        } ));

        button3.addActionListener((e -> {
            new HistoryFrame().setVisible(true);
            dispose();
        }));

        button4.addActionListener((e -> {
            System.exit(0);
        }));
    }
}
