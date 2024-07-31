package test;

import java.util.*;

public class Inventory {
	 private Map<Integer, Product> products;
	 
	    public Inventory() {
	        products = new HashMap<>();
	    }

	    public void addProduct(Product product) {
	        if (products.containsKey(product.getProductId())) {
	            System.out.println("Product with ID " + product.getProductId() + " already exists.");
	        } else {
	            products.put(product.getProductId(), product);
	            System.out.println("Product added: " + product);
	        }
	    }

	    public void updateProduct(Product product) {
	        if (products.containsKey(product.getProductId())) {
	            products.put(product.getProductId(), product);
	            System.out.println("Product updated: " + product);
	        } else {
	            System.out.println("Product with ID " + product.getProductId() + " does not exist.");
	        }
	    }

	    public void deleteProduct(int productId) {
	        if (products.containsKey(productId)) {
	            products.remove(productId);
	            System.out.println("Product with ID " + productId + " deleted.");
	        } else {
	            System.out.println("Product with ID " + productId + " does not exist.");
	        }
	    }
	    public void displayProducts() {
	        if (products.isEmpty()) {
	            System.out.println("No products available.");
	        } else {
	            for (Product product : products.values()) {
	                System.out.println(product);
	            }
	        }
	    }


}
