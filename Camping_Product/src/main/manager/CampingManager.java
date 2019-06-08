package main.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import main.model.CampingProduct;

public class CampingManager implements Comparator<CampingProduct> {
    public ArrayList<CampingProduct> products;

    public CampingManager() {
        products = new ArrayList<CampingProduct>();
    }

    public CampingManager(final ArrayList<CampingProduct> products) {
        this.products = products;
    }

    public void showCampingProducts() {
        for (CampingProduct campingProduct : products) {
            campingProduct.show();
        }
    }

    public final ArrayList<CampingProduct> findByPriceLowerThen() {
        products.sort(Comparator.comparing(CampingProduct::getPrice));
        return this.products;
    }

    public final void sortCampingProductByWeight() {
        products.sort(Comparator.comparing(CampingProduct::getWeight));
    }

    public final void sortCampingProductByWeight(final boolean reverse) {
        if (reverse) {
            products.sort(Comparator
                    .comparing(CampingProduct::getWeight).reversed());
        }
            else {
            products.sort(Comparator
                    .comparing(CampingProduct::getWeight));
            }
    }

    public final void sortCampingProductByProducerName() {
        products.sort(Comparator.comparing(CampingProduct::getProducerName));
    }

    public final void sortCampingProductByProducerName(final boolean reverse) {
        if (reverse) {
            products.sort(Comparator
                    .comparing(CampingProduct::getProducerName).reversed());
        }
        else {
            products.sort(Comparator
                    .comparing(CampingProduct::getProducerName));
        }
    }

    @Override
    public final  int compare(final CampingProduct cp1, final CampingProduct cp2) {
        return Double.compare(cp1.getPrice(), cp2.getPrice());
    }

    public final void addCampingProduct(final CampingProduct cp) {
        products.add(cp);
    }
}
