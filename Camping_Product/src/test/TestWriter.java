package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import main.manager.CampingManager;
import main.model.Backpack;
import main.model.SleepingBag;
import main.model.Tent;
import main.model.Backpack.BackpackType;
import main.model.Backpack.Color;
import main.model.SleepingBag.SleepingBagMaterial;
import main.model.Tent.Construction;
import main.model.Tent.TentForm;
import writer.ProductCampingWriter;

class TestWriter {
	@Test
	void test() {
		CampingManager cm = new CampingManager();
        cm.addCampingProduct(new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE));
        cm.addCampingProduct(new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED));
        cm.addCampingProduct(new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL));
		
		ProductCampingWriter.writeToFile(cm.products);
		
		String current_text = "";
		Scanner in;
		try {
			in = new Scanner(new File("camping_product.csv"));
			while(in.hasNext())
				current_text += in.nextLine();
			in.close();
		} catch (FileNotFoundException e) {
			
		}
		
		String text = "producerName,price,weight,capacity,construction,tentForm" +
				"Reebok,500.0,20.0,4,ONE_STORY,LODGE" +
				"producerName,price,weight,volumes,backbackType,color" +
				"Adidas,500.0,15.0,40.0,BAG,RED" +
				"producerName,price,weight,type,lenght,sleepingBagMaterial" +
				"Aer,500.0,30.0,Blanket,2.0,WOOL";
		assertEquals(text, current_text);
	}
}
	