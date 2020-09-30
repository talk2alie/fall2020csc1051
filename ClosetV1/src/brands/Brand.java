package brands;

/**
 * Represents a brand that manufactures clothes or shoes
 */
public class Brand {
    private final int id;
    private final String name;
    private final String customerSupportNumber;
    private final int yearEstablished;

    /**
     * Creates a new instance of a brand with the given set of parameters
     * @param id - A unique identifier for the brand
     * @param name - The name of the brand
     * @param customerSupportNumber - The customer support number of the brand
     * @param yearEstablished - The year the brand was established
     */
    public Brand(int id, String name, String customerSupportNumber, int yearEstablished) {
        this.id = id;
        this.name = name;
        this.customerSupportNumber = customerSupportNumber;
        this.yearEstablished = yearEstablished;
    }

    /**
     * Gets the unique identifier of the brand
     * @return An integer that identifies the brand
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the brand
     * @return A String that is the brand's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the brand's customer support phone number
     * @return A formatted String of the brand's phone number
     */
    public String getCustomerSupportNumber() {
        return customerSupportNumber;
    }

    /**
     * Gets the brand's establishment year
     * @return An integer that is the year the brand was established
     */
    public int getEstablishedYear() {
        return yearEstablished;
    }

    @Override
    public String toString() {
        return name + System.getProperty("line.separator") + "Customer Support: " + customerSupportNumber
                + System.getProperty("line.separator");
    }
    
    public String format() {
        // Id,Name,CustomerSupportNumber,YearEstablished
        return id + "," + name + "," + customerSupportNumber + "," + yearEstablished;
    }
}
