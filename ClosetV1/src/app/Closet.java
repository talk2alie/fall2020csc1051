package app;

import java.io.FileNotFoundException;
import java.io.IOException;

import brands.Brand;
import brands.BrandDictionary;

public class Closet {
    public static void main(String[] args) throws FileNotFoundException {
        var brandDictionary = new BrandDictionary();
        var brand = new Brand(3, "Chanel", "1 (877) 572 3233", 1810);
        try {
			brandDictionary.Add(brand);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println();
    }
}
