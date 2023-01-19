package Controller;
import Model.UserModel;
import Entitiy.UserEntitiy;

public class AuthorizationController {

    public boolean login(String username, String password) {
        for (UserEntitiy user : UserModel.getRegisteredAkun()) {
            if((user.getUsername().equals(username)) && (user.getPassword().equals(password))) {
                UserModel.setUserHasLogin(user);
                return true;
            }
        }return false;
    }

    public boolean regis(UserEntitiy newAkun) {
        for (UserEntitiy akun: UserModel.getRegisteredAkun()) {
            if (akun.getUsername().equals(newAkun.getUsername()) || akun.getNo_Telp().equals(newAkun.getNo_Telp()))
                return false;
        }
        UserModel.newAccount(newAkun);
        return true;
    }

    public static boolean verifPin(String pin) {
        return UserModel.getUserHasLogin().getPin().equals(pin);
    }
}
