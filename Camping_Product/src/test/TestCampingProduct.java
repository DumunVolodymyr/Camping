package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.Backpack;
import main.model.Backpack.BackpackType;
import main.model.Backpack.Color;
import main.model.CampingProduct;
import main.model.SleepingBag;
import main.model.SleepingBag.SleepingBagMaterial;
import main.model.Tent;
import main.model.Tent.Construction;
import main.model.Tent.TentForm;

class TestCampingProduct {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }
    
    @Test
    void testTent() {
            CampingProduct cp1 = new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE);
            assertEquals(500, cp1.getPrice()); 
            assertEquals(20, cp1.getWeight());
            assertEquals("Reebok", cp1.getProducerName());
    }
    
    @Test
    void testBackpack() {
            CampingProduct cp1 = new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED);
            assertEquals(500, cp1.getPrice()); 
            assertEquals(15, cp1.getWeight());
            assertEquals("Adidas", cp1.getProducerName());
    }

    @Test
    void testSleepingBag() {
            CampingProduct cp1 = new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL);
            assertEquals(500, cp1.getPrice()); 
            assertEquals(30, cp1.getWeight());
            assertEquals("Aer", cp1.getProducerName());
    }
}
