public class Product {
    private String name;
    private double price;
    private int quantity;
    private String unit;

    /**
     * Product class constructor 
     * @param name name of the item
     * @param price price of the item 
     * @param quantity number of items 
     */
    public Product(String name, double price, int quantity, String unit) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (price < 0.0){
            throw new IllegalArgumentException("Price of item cannot be negative.");
        }
        if (quantity < 0){
            throw new IllegalArgumentException("Cannot have negative quantity of item.");
        }
        if (unit == null || unit.trim().isEmpty()){
            throw new IllegalArgumentException("Must be a valid unit of measurement");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * Getter for name
     * @return name of item
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for price
     * @return price of item
     */
    public double getPrice(){
        return price;
    }

    /**
     * Getter for quantity
     * @return quantity of items
     */
    public int getQuantity(){
        return quantity;
    }

    public String getUnit(){
        return unit;
    }

    /**
     * Setter for name field
     * @param name
     */
    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            System.out.println("Error: Product name cannot be empty.");
            return;
        }
        this.name = name;
    }

    /**
     * Setter for price field
     * @param price
     */
    public void setPrice(double price){
        if (price < 0.0) {
            System.out.println("Error: Price cannot be a negative number.");
            return;
        }
        this.price = price;
    }

    /**
     * Setter for quantity field
     * @param quantity
     */
    public void setQuantity(int quantity){
        if (quantity < 0){
            System.out.println("Error: Quantity cannot be negative.");
            return;
        }
        this.quantity = quantity;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    @Override
    public String toString(){
        return String.format("Product: %10s | Price: $%5.2f | Quantity: %5d | Unit: %5s" ,name, price, quantity, unit);
        // return "Product: " + name + " | Price: $" + price + " | Quantity: " + quantity + " | Unit: " + unit;  
    }
}

