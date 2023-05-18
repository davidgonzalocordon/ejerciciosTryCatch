package co.edu.udes.taller_3.Cine;

import java.util.Date;

class Funcion {

    private Pelicula movie;
    private Sala cinemaRoom;
    private String startTime;
    private String finalTime;
    private String date;
    private String id;

    public Funcion(Pelicula movie, Sala cinemaRoom, String startTime, String finalTime, String date, String id) {
        this.movie = movie;
        this.cinemaRoom = cinemaRoom;
        this.startTime = startTime;
        this.finalTime = finalTime;
        this.date = date;
        this.id = id;
    }

    public Funcion() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public void setCinemaRoom(Sala cinemaRoom) {
        this.cinemaRoom = cinemaRoom;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public Sala getCinemaRoom() {
        return cinemaRoom;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Function{" + "movie=" + movie + ", cinemaRoom=" + cinemaRoom + ", startTime=" + startTime + ", finalTime=" + finalTime + ", date=" + date + ", id=" + id + '}';
    }

}
