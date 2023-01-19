package Model;
import Entitiy.UserEntitiy;
import java.util.ArrayList;

public class UserModel {
    static UserEntitiy userEntitiyHasLogin = null;
    static private ArrayList<UserEntitiy> registeredAkun = new ArrayList<>();

    public static void initUser(){
        UserEntitiy userEntitiy = new UserEntitiy("Teguh Firdaus Alfaraih","TFA", "081331065985" , "12345","123");
        registeredAkun.add(userEntitiy);
    }

    static public void newAccount(UserEntitiy userEntitiy){
        registeredAkun.add(userEntitiy);
    }

    public static ArrayList<UserEntitiy> getRegisteredAkun() {
        return registeredAkun;
    }

    public static UserEntitiy getUserHasLogin() {
        return userEntitiyHasLogin;
    }

    public static void setUserHasLogin(UserEntitiy user) {
        UserModel.userEntitiyHasLogin = user;
    }

    public static void logout() {
        userEntitiyHasLogin = null;
    }
}
