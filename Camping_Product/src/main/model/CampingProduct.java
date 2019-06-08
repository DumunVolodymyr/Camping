package main.model;

public abstract class CampingProduct {
    private  String producerName;
    private double price;
    private double weight;
    public String getHeaders;
    public String toCSV;

    public CampingProduct() {
    }

    public CampingProduct(final double price, final double weight,
        final String producerName) {
        this.price = price;
        this.weight = weight;
        this.producerName = producerName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }

    public final String getProducerName() {
        return producerName;
    }

    public final void setProducerName(final String producerName) {
        this.producerName = producerName;
    }

    public void show() {
        System.out.println(price + " " + weight + " " + producerName);
    }
    public String getHeaders() {
        return "producerName," + "price," + "weight";
    }
    
    public String toCSV() {
        return producerName + "," + price + "," + weight;
    }
    
}
