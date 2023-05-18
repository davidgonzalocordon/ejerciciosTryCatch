package co.edu.udes.Supermercado;

import java.util.Date;
import java.util.List;

class Factura {

    private List<Producto> products;
    private Employ employ;
    private Client client;
    private List<Integer> n_productos;
    private Date fecha_venta;

    public Factura(List<Producto> products, Employ employ, Client client, Date fecha_venta) {
        this.products = products;
        this.employ = employ;
        this.client = client;
        this.fecha_venta = fecha_venta;
    }

    public Factura(List<Producto> products, Employ employ, Client client) {
        this.products = products;
        this.employ = employ;
        this.client = client;
    }


    public List<Producto> getProducts() {
        return products;
    }

    public void setProducts(List<Producto> products) {
        this.products = products;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Integer> getN_productos() {
        return n_productos;
    }

    public void setN_productos(List<Integer> n_productos) {
        this.n_productos = n_productos;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice()* n_productos.get(i);
        }
        return total;
    }
}
