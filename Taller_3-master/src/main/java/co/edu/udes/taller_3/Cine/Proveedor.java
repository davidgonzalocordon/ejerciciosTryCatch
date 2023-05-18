
package co.edu.udes.taller_3.Cine;

class Proveedor {
    private String name;
    private String id_food_received;

    public Proveedor() {
    }

    public Proveedor(String name, String id_food_received) {
        this.name = name;
        this.id_food_received = id_food_received;
    }

    public Proveedor(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_food_received() {
        return id_food_received;
    }

    public void setId_food_received(String id_food_received) {
        this.id_food_received = id_food_received;
    }

}
