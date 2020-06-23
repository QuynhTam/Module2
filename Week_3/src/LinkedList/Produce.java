package LinkedList;

public class Produce implements Comparable<Produce> {
    private int id;
    private String nameProduce;
    private int price;

    public Produce() {
    }

    public Produce(int id, String nameProduce, int price) {
        this.id = id;
        this.nameProduce = nameProduce;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduce() {
        return nameProduce;
    }

    public void setNameProduce(String nameProduce) {
        this.nameProduce = nameProduce;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id = " + id + ", Produce = " + nameProduce + ", Price = " + price+",000,000 VNĐ";
    }

    @Override
    public int compareTo(Produce o) {
        return this.getNameProduce().compareTo(o.getNameProduce());
    }
}


