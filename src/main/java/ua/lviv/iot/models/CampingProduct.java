package ua.lviv.iot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
		
@Entity
@Inheritance
public class CampingProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;

	private String producerName;
	private double price;
	private double weight;
	
	public CampingProduct() {}
	
	public CampingProduct(double price, double weight, String producerName) {
		this.price = price;
		this.weight = weight;
		this.producerName = producerName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}
	

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	
	public void Show() {
		System.out.println(price + " " + weight + " " + producerName);
	}
	
//	public ArrayList<CampingProduct> sort() {
//		return 
//	}
}

