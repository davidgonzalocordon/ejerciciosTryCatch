
package co.edu.udes.taller_3.Cine;

public class Bodega {
    private String[] product_food; 
    private int[] quantity_product;
    private String name_worker; 

    public Bodega() {
    }

    public Bodega(String[] product_food, int[] quantity_product, String name_worker) {
        this.product_food = product_food;
        this.quantity_product = quantity_product;
        this.name_worker = name_worker;
    }

    public String[] getProduct_food() {
        return product_food;
    }

    public void setProduct_food(String[] product_food) {
        this.product_food = product_food;
    }

    public int[] getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(int[] quantity_product) {
        this.quantity_product = quantity_product;
    }

    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name_worker) {
        this.name_worker = name_worker;
    }
 
}
