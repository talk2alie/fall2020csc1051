package brands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BrandDictionary {
    private final String brandsFileName = "brands.csv";
    private final ArrayList<Brand> brands;

    public BrandDictionary() throws FileNotFoundException {
        brands = new ArrayList<>();

        var reader = new Scanner(new File(brandsFileName));
        if (reader.hasNextLine()) {
            reader.nextLine();
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            Brand brand = getBrandFrom(line);
            brands.add(brand);
        }
        reader.close();
    }

    private Brand getBrandFrom(String line) {
        final int idIndex = 0;
        final int nameIndex = 1;
        final int customerSupportNumberIndex = 2;
        final int yearEstablishedIndex = 3;

        String[] properties = line.split(",");
        int id = Integer.parseInt(properties[idIndex].trim());
        String name = properties[nameIndex].trim();
        String customerSupportNumber = properties[customerSupportNumberIndex].trim();
        int yearEstablished = Integer.parseInt(properties[yearEstablishedIndex].trim());

        return new Brand(id, name, customerSupportNumber, yearEstablished);
    }

    public Brand findBy(int id) {
        return null;
    }

    public boolean Add(Brand brand) throws IOException {
        var file = new File(brandsFileName);
        var writer = new FileWriter(file, true);
        writer.append(brand.format() + System.getProperty("line.separator"));
        writer.close();

        return brands.add(brand);
    }
    
    public int getMaxId() {
        return brands.get(brands.size() - 1).getId();
    }
}
