package web.model;

public class Car {
    private int id;
    private String color;
    private String price;

    public Car(int id, String color, String price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + id + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
