package co.edu.udes.taller_3.Cine;

import java.util.Date;

public class Trabajador {

    private String name;
    private String id;
    private String celphoneNumber;
    private String schedule;
    private double salary;

    public Trabajador() {
    }

    public Trabajador(String name, String id, String celphoneNumber, String schedule, double salary) {
        this.name = name;
        this.id = id;
        this.celphoneNumber = celphoneNumber;
        this.schedule = schedule;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCelphoneNumber() {
        return celphoneNumber;
    }

    public String getSchedule() {
        return schedule;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCelphoneNumber(String celphoneNumber) {
        this.celphoneNumber = celphoneNumber;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", id=" + id + ", celphoneNumber=" + celphoneNumber + ", schedule=" + schedule + ", salary=" + salary + '}';
    }
}
