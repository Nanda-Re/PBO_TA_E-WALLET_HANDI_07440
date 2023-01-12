package model;
import entity.entity_User;

import java.util.ArrayList;

public class model_User implements model_interface{
    private ArrayList<entity_User> data_admin;
    public model_User() {
        data_admin =new ArrayList<>();
    }
    public ArrayList<entity_User> getdata_admin() {
        return data_admin;
    }

    @Override
    public void read() {

    }

    public void create(Object x ) {
        data_admin.add((entity_User) x);
    }

    public void update(int index, Object x) {
        data_admin.set(index, (entity_User) x);
    }

    public void delete(int index) {
        data_admin.remove(index);
    }
}
