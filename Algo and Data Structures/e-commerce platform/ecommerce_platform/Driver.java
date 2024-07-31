package ecommerce_platform;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of product(s): ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product ID: ");
            String id = sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        System.out.print("Enter product ID to search using linear search: ");
        String linearSearchId = sc.nextLine();
        Product linearSearchResult = Linearsearch.search(products, linearSearchId);
        if (linearSearchResult != null) {
            System.out.println("Linear Search: Product found: " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Product not found.");
        }


        System.out.print("Enter product ID to search using binary search: ");
        String binarySearchId = sc.nextLine();
        Product binarySearchResult = Binarysearch.search(products, binarySearchId);
        if (binarySearchResult != null) {
            System.out.println("Binary Search: Product found: " + binarySearchResult);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
        
        sc.close();
    }


}
