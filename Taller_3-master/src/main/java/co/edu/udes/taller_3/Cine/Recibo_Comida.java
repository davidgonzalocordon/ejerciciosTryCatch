package co.edu.udes.taller_3.Cine;

import java.util.Arrays;

class Recibo_Comida {

    private String billId;
    private Producto_Comida[] productNames;
    private int[] numberOfProduc;
    private double totalPrice;
    private Cliente client;
    private Trabajador worker;

    public Recibo_Comida(String billId, Producto_Comida[] productNames, int[] numberOfProduc, double totalPrice, Cliente client, Trabajador worker) {
        this.billId = billId;
        this.productNames = productNames;
        this.numberOfProduc = numberOfProduc;
        this.totalPrice = totalPrice;
        this.client = client;
        this.worker = worker;
    }

    public Recibo_Comida() {
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Producto_Comida[] getProductNames() {
        return productNames;
    }

    public void setProductNames(Producto_Comida[] productNames) {
        this.productNames = productNames;
    }

    public int[] getNumberOfProduc() {
        return numberOfProduc;
    }

    public void setNumberOfProduc(int[] numberOfProduc) {
        this.numberOfProduc = numberOfProduc;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Trabajador getWorker() {
        return worker;
    }

    public void setWorker(Trabajador worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Bill_Food{" + "billId=" + billId + ", productNames=" + Arrays.toString(productNames) + ", productId=" + Arrays.toString(numberOfProduc) + ", totalPrice=" + totalPrice + ", client=" + client + ", worker=" + worker + '}';
    }
}
