package main;

import main.manager.CampingManager;
import main.model.Backpack;
import main.model.SleepingBag;
import main.model.Tent;
import main.model.Backpack.BackpackType;
import main.model.Backpack.Color;
import main.model.CampingProduct;
import main.model.SleepingBag.SleepingBagMaterial;
import main.model.Tent.Construction;
import main.model.Tent.TentForm;
import writer.ProductCampingWriter;

public class main {
    public static void main(String[] args) {
        CampingManager cm = new CampingManager();
        cm.addCampingProduct(new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE));
        cm.addCampingProduct(new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED));
        cm.addCampingProduct(new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL));
        
        System.out.println("CP 1");
        cm.showCampingProducts();
        
        System.out.println("CP 2");
        cm.sortCampingProductByWeight(true);
        cm.showCampingProducts();
        
        System.out.println("CP 3");
        cm.sortCampingProductByProducerName();
        cm.showCampingProducts();
    }

}