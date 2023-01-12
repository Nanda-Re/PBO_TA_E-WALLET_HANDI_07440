package controller;
import entity.entity_TopUp;
import model.model_TopUp;
import java.util.ArrayList;

public class controller_TopUp {
    public model_TopUp objTopUp = new model_TopUp();
    public ArrayList<entity_TopUp> read() {
        return  objTopUp.getData_TopUp();
    }
    public void create(entity_TopUp TopUp) {
        objTopUp.create(TopUp);
    }
    public void delete(int index) {
        objTopUp.delete(index);
    }
    public void update(int index, entity_TopUp mobil) {
        objTopUp.update(index, mobil);
    }
}
