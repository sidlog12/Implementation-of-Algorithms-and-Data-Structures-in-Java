package library_management;
import java.util.*;

public class BinaryBookSearch {
	 public static Book findBookByTitle(Book[] books, String title) {
	        int left = 0;
	        int right = books.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            Book midBook = books[mid];
	            int cmp = midBook.getTitle().compareToIgnoreCase(title);

	            if (cmp == 0) {
	                return midBook; 
	            } else if (cmp < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return null; 
	        }

	    public static Book findBookByTitle(List<Book> books, String title) {
	        return findBookByTitle(books.toArray(new Book[0]), title);
	    }


}
