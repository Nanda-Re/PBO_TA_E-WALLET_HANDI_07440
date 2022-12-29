package controller;

import entity.entity_user;
import model.model_user;

import java.util.ArrayList;

public class controller_user {
    public model_user objkaryawan = new model_user();
    public ArrayList<entity_user> read() {
        return  objkaryawan.getdata_karyawan();
    }
    public void create(entity_user karyawan) {
        objkaryawan.create(karyawan);
    }
    public void delete(int index) {
        objkaryawan.delete(index);
    }
    public void update(int index, entity_user karyawan) {
        objkaryawan.update(index, karyawan);
    }
}