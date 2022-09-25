package staticSamples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
   Product instance with unique IDs
 */
public class Product {  
    private String description;
    private double price;
    public final String PRODUCT_ID;
    private static long cnt;

    public Product(String description, double price) {
        setDescription(description);
        setPrice(price);
        PRODUCT_ID = String.format("P%06d", cnt);
    }
    public double getPrice() {
        return price;
    }
    public final void setPrice(double price) {
        this.price = price>0?price: 1;
    }
    public String getDescription() {
        return description;
    }
    public final void setDescription(String description) {
        this.description = description != null?description:"Unnamed product";
    }
    @Override
    public String toString() {
        return String.format("Product:%s :price:%.2f, description: %s", 
                                       PRODUCT_ID, price, description);
    }
}
