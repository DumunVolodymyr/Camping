package main.model;

public class Tent extends CampingProduct {
    public enum TentForm {
        LODGE, HEMISPHERE, MAQUEE

    }

    public enum Construction {
        ONE_STORY, TWO_STORY

    }

    private int capacity;
    private Construction construction;
    private TentForm tentForm;

    public Tent() {
    }

    public Tent(final double price, final double weight,
            final String producerName,
            final int capacity, final Construction construction,
            final TentForm tentForm) {
        super(price, weight, producerName);
        this.capacity = capacity;
        this.construction = construction;
        this.tentForm = tentForm;
    }

    public final int getCapacity() {
        return capacity;
    }

    public final void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public final Construction getConstruction() {
        return construction;
    }

    public final void setConstruction(final Construction construction) {
        this.construction = construction;
    }

    public final TentForm getTentForm() {
        return tentForm;
    }

    public final void setTentForm(final TentForm tentForm) {
        this.tentForm = tentForm;
    }

    @Override
    public final void show() {
        super.show();
        System.out.println(capacity + " " + construction + " " + tentForm);
    }
    public String getHeaders() {
        return super.getHeaders() + ",capacity," + "construction," + "tentForm";
    }
    public String toCSV() {
        return super.toCSV() + "," + capacity + "," + construction + "," + tentForm;
    }
}
