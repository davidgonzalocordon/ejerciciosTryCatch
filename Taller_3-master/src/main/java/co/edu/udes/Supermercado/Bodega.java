
package co.edu.udes.Supermercado;

import java.util.List;

public class Bodega {
    private String name;
    private String location;
    private List<Producto> productList;
    private Employ manager;

    public Bodega(String name, String location, Employ manager, List<Producto> listaProductos) {
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.productList=listaProductos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employ getManager() {
        return manager;
    }

    public void setManager(Employ manager) {
        this.manager = manager;
    }

    public List<Producto> getProductList() {
        return productList;
    }

    public void setProductList(List<Producto> productList) {
        this.productList = productList;
    }
}
