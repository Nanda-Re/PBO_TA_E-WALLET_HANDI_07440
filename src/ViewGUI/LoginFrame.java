package ViewGUI;

import Controller.AuthorizationController;

import javax.swing.*;

public class LoginFrame extends MainFrame {
    JLabel title;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton masukButton;
    AuthorizationController authCon = new AuthorizationController();
    public LoginFrame(){
        super("Login Menu", 656,444);
    }

    @Override
    protected void component() {
        title = new JLabel("Login");
        setSize(title,64);
        boundedAdd(title,133,79,177,90);

        usernameLabel = new JLabel("Username");
        boundedAdd(usernameLabel,58,249,91,17);

        passwordLabel = new JLabel("Passsword");
        boundedAdd(passwordLabel,58,346,91,17);

        usernameField = new JTextField();
        boundedAdd(usernameField,58,266,326,48);

        passwordField = new JPasswordField();
        boundedAdd(passwordField,59, 363, 326,52);

        masukButton = new JButton("Masuk");
        boundedAdd(masukButton,165, 447, 113,36);
    }

    @Override
    protected void event() {
        masukButton.addActionListener((e) -> {
            String username = usernameField.getText();
            String pass = passwordField.getText();
            boolean login = authCon.login(username,pass);
            if(login){
                new HomeFrame().setVisible(true);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null,"Username atau password salah","Allert!!",JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
