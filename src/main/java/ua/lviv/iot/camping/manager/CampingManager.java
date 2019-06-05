package ua.lviv.iot.camping.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ua.lviv.iot.models.CampingProduct;

public class CampingManager implements Comparator<CampingProduct>{
	private ArrayList<CampingProduct> products;
	
	public CampingManager() {
		products = new ArrayList<CampingProduct>();
	}
	
	public CampingManager(ArrayList<CampingProduct> products) {
		this.products = products;
	}
	
	public void ShowCampingProducts() {
		for (CampingProduct campingProduct : products) {
			campingProduct.Show();
		}
	}
	
	public ArrayList<CampingProduct> findByPriceLowerThen(){
		products.sort(Comparator.comparing(CampingProduct::getPrice));
		return this.products;
	}
	
	public void sortCampingProductByWeight() {
		products.sort(Comparator.comparing(CampingProduct::getWeight));
	}
	
	public void sortCampingProductByWeight(boolean reverse) {
		products.sort(Comparator.comparing(CampingProduct::getWeight));
		if(reverse)
			Collections.reverse(products);
	}
	
	public void sortCampingProductByProducerName() {
		products.sort(Comparator.comparing(CampingProduct::getProducerName));
	}
	
	public void sortCampingProductByProducerName(boolean reverse) {
		products.sort(Comparator.comparing(CampingProduct::getProducerName));
		if(reverse)
			Collections.reverse(products);
	}

	@Override
	public int compare(CampingProduct cp1, CampingProduct cp2) {
		return Double.compare(cp1.getPrice(), cp2.getPrice());
	}
	
	public void addCampingProduct(CampingProduct cp) {
		products.add(cp);
	}
}


