package ua.lviv.iot.model;

public class Coffee {

    private int id;
    private String name;
    private double price;
    private int volumeInMl;

    public Coffee() {
    }

    public Coffee(String name, double price, int volumeInMl) {
        this.name = name;
        this.price = price;
        this.volumeInMl = volumeInMl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }

    public void setVolumeInMl(int volumeInMl) {
        this.volumeInMl = volumeInMl;
    }
}	
