package co.edu.udes.taller_3.Cine;

public class Caja {

    private String box_id;
    private int change_available;
    private String name_worker;

    public Caja() {
    }

    public Caja(String box_id, int change_available, String name_worker) {
        this.box_id = box_id;
        this.change_available = change_available;
        this.name_worker = name_worker;
    }

    public Caja(String box_id, int change_available) {
        this.box_id = box_id;
        this.change_available = change_available;
    }

    public String getBox_id() {
        return box_id;
    }

    public void setBox_id(String box_id) {
        this.box_id = box_id;
    }

    public int getChange_available() {
        return change_available;
    }

    public void setChange_available(int change_available) {
        this.change_available = change_available;
    }

    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name_worker) {
        this.name_worker = name_worker;
    }

}
