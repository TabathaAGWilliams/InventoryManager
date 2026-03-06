public class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Product class constructor 
     * @param name name of the item
     * @param price price of the item 
     * @param quantity number of items 
     */
    public Product(String name, double price, int quantity) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (price < 0.0){
            throw new IllegalArgumentException("Price of item cannot be negative.");
        }
        if (quantity < 0){
            throw new IllegalArgumentException("Cannot have negative quantity of item.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    @Override
    public String toString(){
        return "Product: " + name + " | Price: $" + price + " | Quantity: " + quantity;  
    }
}

