package model;

import entity.entity_user;

import java.util.ArrayList;

public class model_user implements model_interface{
    private ArrayList<entity_user> data_karyawan;
    public model_user() {
        data_karyawan=new ArrayList<>();
    }
    public ArrayList<entity_user> getdata_karyawan() {
        return data_karyawan;
    }

    @Override
    public void read() {

    }

    public void create(Object x ) {
        data_karyawan.add((entity_user) x);
    }

    public void update(int index, Object x) {
        data_karyawan.set(index, (entity_user) x);
    }

    public void delete(int index) {
        data_karyawan.remove(index);
    }
}