package ua.lviv.iot.models;

import javax.persistence.Entity;

@Entity
public class Backpack extends CampingProduct {
	/*public enum BackpackType{
		BAG,
		SUITCASE,
		BICYCLE_LOCK
	}
	public enum Color{
		RED,
		YELLOW,
		GREEN
	}*/
	
	private double volumes;
	//private BackpackType backpackType;
	//private Color color;
	
	public Backpack() {}
	
	public Backpack(double price, double weight, String producerName, double volumes
			//BackpackType backpackType, Color color
			) {
		super(price, weight, producerName);
		this.volumes = volumes;
		//this.backpackType = backpackType;
	//	this.color = color;
	}
	
	public double getVolumes() {
		return volumes;
	}
	
	public void setVolumes(double volumes) {
		this.volumes = volumes;
	}
	
/*	public BackpackType getBackpackType() {
		return backpackType;
	}
	
	public void setBackpackType(BackpackType backpackType) {
		this.backpackType = backpackType;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	} 
	*/
	@Override
	public void Show() {
		super.Show();
		System.out.println(volumes + " ");
		//+ backpackType + " " + color);
	}

}
