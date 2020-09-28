package clothing;

import brands.Brand;

public class Cloth {
    private final int id;
    private final String name;
    private final String colors;
    private final int brandId;
    
    public Cloth(int id, String name, String colors, int brandId) {
        this.id = id;
        this.name = name;
        this.colors = colors;
        this.brandId = brandId;
    }
}
