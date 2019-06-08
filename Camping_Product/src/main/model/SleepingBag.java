package main.model;

public class SleepingBag extends CampingProduct {
    public enum SleepingBagMaterial {
        HOLLQWFIBER, THERMOLITE, WOOL
    }

    private String type;
    private double lenght;
    private SleepingBagMaterial sleepingBagMaterial;

    public SleepingBag() {
    }

    public SleepingBag(final double price, final double weight, final String producerName, final String type,
            final double lenght, final SleepingBagMaterial sleepingBagMaterial) {
        super(price, weight, producerName);
        this.type = type;
        this.lenght = lenght;
        this.sleepingBagMaterial = sleepingBagMaterial;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(final double lenght) {
        this.lenght = lenght;
    }

    public final SleepingBagMaterial getSleepingBagMaterial() {
        return sleepingBagMaterial;
    }

    public void setSleepingBagMaterial(final SleepingBagMaterial sleepingBagMaterial) {
        this.sleepingBagMaterial = sleepingBagMaterial;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(type + " " + lenght + " " + sleepingBagMaterial);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",type," + "lenght," + "sleepingBagMaterial";
    }

    public String toCSV() {
        return super.toCSV() + "," + type + "," + lenght + "," + sleepingBagMaterial;
    }

}
