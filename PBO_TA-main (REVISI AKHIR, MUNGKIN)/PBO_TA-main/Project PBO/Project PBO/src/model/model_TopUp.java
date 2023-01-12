package model;
import java.util.ArrayList;
import entity.entity_TopUp;

public class model_TopUp implements model_interface {
    private ArrayList<entity_TopUp> data_TopUp;
    public model_TopUp() {
        data_TopUp = new ArrayList<>();
    }
    public ArrayList<entity_TopUp> getData_TopUp(){
        return data_TopUp;
    }
    public void  read()
    {

    }
    public void create(Object x ) {
        data_TopUp.add((entity_TopUp) x);
    }
    public void update(int index, Object x) {
        data_TopUp.set(index, (entity_TopUp) x);
    }
    public void delete(int index) {
        data_TopUp.remove(index);
    }

}