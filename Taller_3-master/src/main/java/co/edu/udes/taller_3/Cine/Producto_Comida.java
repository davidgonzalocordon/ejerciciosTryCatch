package co.edu.udes.taller_3.Cine;

public class Producto_Comida {

    private String id;
    private String name;
    private String typeOfProduct;
    private double foodPrice;

    public Producto_Comida() {
    }

    public Producto_Comida(String id, String name, String typeOfProduct, double foodPrice) {
        this.id = id;
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.foodPrice = foodPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    @Override
    public String toString() {
        return "Product_Food{" + "id=" + id + ", name=" + name + ", typeOfProduct=" + typeOfProduct + ", foodPrice=" + foodPrice + '}';
    }
}
