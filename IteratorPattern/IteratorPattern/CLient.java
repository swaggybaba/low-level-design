package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLient {

	public static void main(String[] args) {
		List<Book> booksList = new ArrayList<>(Arrays.asList(new Book(130,"MATHS"),new Book(150,"PHYSICS"),new Book(200, "CHEMISTRY")));
		Library library = new Library(booksList);
		Iterator iterator = library.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
