
package co.edu.udes.taller_3.Cine;

class Cliente {
    private String name;
    private String id;
    private boolean cinemaCard;

    public Cliente() {
    }
    public Cliente(String name, String id, boolean cinemaCard) {
        this.name = name;
        this.id = id;
        this.cinemaCard = cinemaCard;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCinemaCard(boolean cinemaCard) {
        this.cinemaCard = cinemaCard;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isCinemaCard() {
        return cinemaCard;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", id=" + id + ", cinemaCard=" + cinemaCard + '}';
    }
    
}
