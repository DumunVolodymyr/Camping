package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.manager.CampingManager;
import main.model.Backpack;
import main.model.Backpack.BackpackType;
import main.model.Backpack.Color;
import main.model.CampingProduct;
import main.model.SleepingBag;
import main.model.SleepingBag.SleepingBagMaterial;
import main.model.Tent;
import main.model.Tent.Construction;
import main.model.Tent.TentForm;

class TestManager {
    CampingManager cm;

    @BeforeEach
    void setUp() throws Exception {
        cm = new CampingManager();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testSortCampingProductByProducerName() {
        CampingProduct tent = new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE);
        CampingProduct backpack = new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED);
        CampingProduct sleepingBag = new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL);
        cm.addCampingProduct(tent);
        cm.addCampingProduct(backpack);
        cm.addCampingProduct(sleepingBag);
        cm.sortCampingProductByProducerName();
        assertEquals(cm.products.get(0), backpack);
        assertEquals(cm.products.get(1), sleepingBag);
        assertEquals(cm.products.get(2), tent);
    }

    @Test
    void testSortCampingProductByWeight() {
        CampingProduct tent = new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE);
        CampingProduct backpack = new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED);
        CampingProduct sleepingBag = new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL);
        cm.addCampingProduct(tent);
        cm.addCampingProduct(backpack);
        cm.addCampingProduct(sleepingBag);
        cm.sortCampingProductByWeight();
        assertEquals(cm.products.get(0), backpack);
        assertEquals(cm.products.get(1), tent);
        assertEquals(cm.products.get(2), sleepingBag);
    }

    @Test
    void testShowCampingProducts() {
        try {
            cm.addCampingProduct(new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE));
            cm.addCampingProduct(new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED));
            cm.addCampingProduct(new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL));
            cm.showCampingProducts();
        } catch (Exception e) {

        }
    }

    @Test
    void testAddCampingProduct() {
        CampingProduct tent = new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE);
        cm.addCampingProduct(tent);
        assertEquals(cm.products.get(0), tent);
    }
}
