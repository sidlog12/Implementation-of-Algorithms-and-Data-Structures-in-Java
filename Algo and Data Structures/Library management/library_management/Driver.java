package library_management;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of book(s): ");
		int numBooks = sc.nextInt();
		sc.nextLine(); // Consume the newline

		List<Book> bookList = new ArrayList<>();

		for (int i = 0; i < numBooks; i++) {
			System.out.print("Enter book ID: ");
			int bookId = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Enter book title: ");
			String title = sc.nextLine();

			System.out.print("Enter book author: ");
			String author = sc.nextLine();

			bookList.add(new Book(bookId, title, author));
		}

		bookList.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

		System.out.print("Enter the title of the book to search for: ");
		String searchTitle = sc.nextLine();

		System.out.print("Choose search method (1 for Binary Search, 2 for Linear Search): ");
		int searchMethod = sc.nextInt();
		sc.nextLine(); 

		if (searchMethod == 1) {
			Book foundBook = BinaryBookSearch.findBookByTitle(bookList, searchTitle);
			if (foundBook != null) {
				System.out.println("Book found: " + foundBook);
			} else {
				System.out.println("Book not found.");
			}
		} else if (searchMethod == 2) {
			List<Book> foundBooks = BookSearch.findBooksByTitle(bookList, searchTitle);
			if (!foundBooks.isEmpty()) {
				System.out.println("Books found:");
				for (Book book : foundBooks) {
					System.out.println(book);
				}
			} else {
				System.out.println("Book not found.");
			}
		} else {
			System.out.println("Invalid search method selected.");
		}

		sc.close();
	}


}
