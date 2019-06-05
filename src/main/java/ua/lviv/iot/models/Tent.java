package ua.lviv.iot.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Tent")

public class Tent extends CampingProduct {
	public enum TentForm{
		LODGE,
		HEMISPHERE,
		MAQUEE
		
	}

	public enum Construction{
	    ONE_STORY,
	    TWO_STORY
	    
	}
	
	private int capacity;
	private Construction construction;
	private TentForm tentForm;
	
	public Tent() {}
	
	public Tent(double price, double weight, String producerName, int capacity, 
			Construction construction, TentForm tentForm) {
		super(price, weight, producerName);
		this.capacity = capacity;
		this.construction = construction;
		this.tentForm = tentForm;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	public Construction getConstruction() {
		return construction;
	}
	
	public void setConstruction (Construction construction) {
		this.construction = construction;
	}
	
	public TentForm getTentForm() {
		return tentForm;
	}
	
	public void setTentForm(TentForm tentForm) {
		this.tentForm = tentForm;
	} 
	
	@Override
	public void Show() {
		super.Show();
		System.out.println(capacity + " " + construction + " " + tentForm);
	}

}

