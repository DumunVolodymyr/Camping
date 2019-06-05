package ua.lviv.iot.models;

public class SleepingBag extends CampingProduct {
	public enum SleepingBagMaterial{
		HOLLQWFIBER,
		THERMOLITE,
		WOOL
	}
	private String type;
	private double lenght;
	private SleepingBagMaterial sleepingBagMaterial;
	
	public SleepingBag() {}
	
	public SleepingBag(double price, double weight, String producerName, String type, double lenght, 
			SleepingBagMaterial sleepingBagMaterial) {
		super(price, weight, producerName);
		this.type = type;
		this.lenght = lenght;
		this.sleepingBagMaterial = sleepingBagMaterial;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public SleepingBagMaterial getSleepingBagMaterial() {
		return sleepingBagMaterial;
	}
	
	public void setSleepingBagMaterial(SleepingBagMaterial sleepingBagMaterial) {
		this.sleepingBagMaterial = sleepingBagMaterial;
	}
	
	@Override
	public void Show() {
		super.Show();
		System.out.println(type + " " + lenght + " " + sleepingBagMaterial);
	}

}
