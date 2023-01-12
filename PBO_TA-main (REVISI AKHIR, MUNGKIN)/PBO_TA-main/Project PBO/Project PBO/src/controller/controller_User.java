package controller;
import java.util.ArrayList;
import model.model_User;
import entity.entity_User;

public class controller_User {
    public model_User objUser = new model_User();
    public ArrayList<entity_User> read() { return  objUser.getdata_admin(); }
    public void create(entity_User User) { objUser.create(User);}
    public void delete(int index) {
        objUser.delete(index);
    }
    public void update(int index, entity_User admin) {
        objUser.update(index, admin);
    }

}