package IteratorPattern;

import java.util.List;

public class Library implements Aggregate {
	//ata structure depends on the way we want to store data 
	List<Book> booksList;
	
	public Library(List<Book> booksList) {
		this.booksList=booksList;
	}
	
	@Override
	public Iterator createIterator() {
		return new BookIterator(booksList);
	}
	
	
}
