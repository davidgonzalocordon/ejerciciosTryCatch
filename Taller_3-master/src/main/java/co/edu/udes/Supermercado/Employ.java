package co.edu.udes.Supermercado;

import java.util.Date;

public class Employ {
    private String name;
    private Date schedule;
    private double salary;
    private String dni;
    private String phone;

    public Employ(String name, Date schedule, double salary, String dni, String phone) {
        this.name = name;
        this.schedule = schedule;
        this.salary = salary;
        this.dni = dni;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
