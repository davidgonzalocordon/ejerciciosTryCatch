package co.edu.udes.Supermercado;

public class Client {

    private String name;
    private String dni;
    private String email;
    private int points;

    public Client() {
    }

    public Client(String name, String dni, String email, int points) {
        this.name = name;
        this.dni = dni;
        this.email = email;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
