package pe.edu.tecsup.ejercicioclase7_android.models;

/**
 * Created by Alumno on 27/03/2018.
 */

public class Food {
    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", time=" + time +
                '}';
    }

    public Food(Integer id, String name, int price, String picture, int time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private Integer id;
    private String name;
    private int price;
    private String picture;
    private int time;
}

