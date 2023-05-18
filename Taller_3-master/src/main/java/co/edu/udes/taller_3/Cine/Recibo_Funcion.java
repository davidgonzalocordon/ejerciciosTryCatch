package co.edu.udes.taller_3.Cine;

import java.util.Date;

class Recibo_Funcion {

    private String billId;
    private String chairId;
    private String cinemaRoomId;
    private double totalPrice;
    private Cliente client;
    private Trabajador worker;
    private Funcion function;

    public Recibo_Funcion(String billId, String chairId, String cinemaRoomId, double totalPrice, Cliente client, Trabajador worker, Funcion function) {
        this.billId = billId;
        this.chairId = chairId;
        this.cinemaRoomId = cinemaRoomId;
        this.totalPrice = totalPrice;
        this.client = client;
        this.worker = worker;
        this.function = function;
    }

    public Recibo_Funcion() {
    }


    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getChairId() {
        return chairId;
    }

    public void setChairId(String chairId) {
        this.chairId = chairId;
    }

    public String getCinemaRoomId() {
        return cinemaRoomId;
    }

    public void setCinemaRoomId(String cinemaRoomId) {
        this.cinemaRoomId = cinemaRoomId;
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

    public Funcion getFunction() {
        return function;
    }

    public void setFunction(Funcion function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Bill_Function{" + "billId=" + billId + ", chairId=" + chairId + ", cinemaRoomId=" + cinemaRoomId + ", totalPrice=" + totalPrice + ", client=" + client + ", worker=" + worker + ", function=" + function + '}';
    }
}
