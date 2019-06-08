package main.model;

public class Backpack extends CampingProduct {
    public enum BackpackType {
        BAG, SUITCASE, BICYCLE_LOCK
    }

    public enum Color {
        RED, YELLOW, GREEN
    }

    private double volumes;
    private BackpackType backpackType;
    private Color color;

    public Backpack() {
    }

    public Backpack(final double price, final double weight,
            final String producerName,
            final double volumes,
            final BackpackType backpackType,
            final Color color) {
        super(price, weight, producerName);
        this.volumes = volumes;
        this.backpackType = backpackType;
        this.color = color;
    }

    public double getVolumes() {
        return volumes;
    }

    public void setVolumes(final double volumes) {
        this.volumes = volumes;
    }

    public BackpackType getBackpackType() {
        return backpackType;
    }

    public void setBackpackType(final BackpackType backpackType) {
        this.backpackType = backpackType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(volumes + " " + backpackType + " " + color);
    }
    public String getHeaders() {
        return super.getHeaders() + ",volumes," + "backbackType," + "color";
    }
    public String toCSV() {
        return super.toCSV() + "," + volumes + "," + backpackType + "," + color;
    }
}