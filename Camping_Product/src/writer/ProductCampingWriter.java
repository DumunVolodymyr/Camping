package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import main.model.CampingProduct;

public class ProductCampingWriter {
	public static void writeToFile(ArrayList<CampingProduct> campingProducts) {
		try (PrintWriter writer = new PrintWriter(new File("camping_product.csv"))) {
			StringBuilder sb = new StringBuilder();

			Boolean flag = false;
			for (CampingProduct campingProduct : campingProducts) {
				if(!flag) {
					sb.append(campingProduct.getHeaders());
					flag = true;
				}
				else
					sb.append("\n" + campingProduct.getHeaders());
				sb.append("\n" + campingProduct.toCSV());
			}

			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}