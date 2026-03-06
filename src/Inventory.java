import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productsList; 

    /**
     * Constructor for Inventory class
     */
    public Inventory(){
        this.productsList = new ArrayList<>();
    }


    /**
     * Add product to the list
     * @param product
     */
    public void addProduct(Product product){
        if (product == null){
            throw new IllegalArgumentException("Product cannot be null/empty.");
        }

        for (Product p : productsList){
            if (p.getName().equalsIgnoreCase(product.getName())){
                System.out.println("Error: A product with that name already exists.");
                return;
            }
        }
        productsList.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    /**
     * Remove product from the list
     * @param name
     */
    public void removeProduct(String name){
        if (name == null || name.trim().isEmpty()){
            System.out.println("Product name cannot be empty/null");
            return;
        }
        for (Product p : productsList) {
            if (p.getName().equalsIgnoreCase(name)){
                productsList.remove(p);
                System.out.println(name + " removed from inventory.");
                return;
            }
            
        }
        System.out.println("Error: Product- '" + name + "'' not found in inventory.");
    }

    /**
     * Search for a product within the list
     * @param name
     * @return
     */
    public Product searchProduct(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        for (Product p : productsList) {
            if (p.getName().equalsIgnoreCase(name)){
                return p;
            } 
        }
        return null;
    }

    /**
     * Update quantity of item in inventory
     * @param name
     * @param newQuantity
     */
    public void updateQuantity(String name, int newQuantity){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (newQuantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        for (Product p : productsList) {
            if (p.getName().equalsIgnoreCase(name)){
                p.setQuantity(newQuantity);
                System.out.println(name + " quantity updated to " + newQuantity + ".");
                return;
            }
        }
        System.out.println("Error: Product '" + name + "' not found in inventory.");
    }

    /**
     * List out the inventory
     */
    public void displayAllProducts(){
        if(productsList.size() == 0){
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product p : productsList){
            System.out.println(p);
        }
        return;
    }
}
