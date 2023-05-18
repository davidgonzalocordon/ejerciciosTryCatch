package co.edu.udes.taller_3.Cine;

import java.util.Arrays;
import java.util.Date;

public class Sala {

    private String id;
    private String type;
    private int numberOfCommonChairs;
    private int numberOfPremiumChairs;
    private int totalOfChairs;
    private Silla[] chair;
    
    public Sala() {
    }

    public Sala(String id, String type, int numberOfCommonChairs, int numberOfPremiumChairs, int totalOfChairs, Silla[] chair) {
        this.id = id;
        this.type = type;
        this.numberOfCommonChairs = numberOfCommonChairs;
        this.numberOfPremiumChairs = numberOfPremiumChairs;
        this.totalOfChairs = totalOfChairs;
        this.chair = chair;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCommonChairs() {
        return numberOfCommonChairs;
    }

    public void setNumberOfCommonChairs(int numberOfCommonChairs) {
        this.numberOfCommonChairs = numberOfCommonChairs;
    }

    public int getNumberOfPremiumChairs() {
        return numberOfPremiumChairs;
    }

    public void setNumberOfPremiumChairs(int numberOfPremiumChairs) {
        this.numberOfPremiumChairs = numberOfPremiumChairs;
    }

    public int getTotalOfChairs() {
        return totalOfChairs;
    }

    public void setTotalOfChairs(int totalOfChairs) {
        this.totalOfChairs = totalOfChairs;
    }

    public Silla[] getChair() {
        return chair;
    }

    public void setChair(Silla[] chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Cinema_Room{" + "id=" + id + ", type=" + type + ", numberOfCommonChairs=" + numberOfCommonChairs + ", numberOfPremiumChairs=" + numberOfPremiumChairs + ", totalOfChairs=" + totalOfChairs + ", chair=" + Arrays.toString(chair) + '}';
    }

}
