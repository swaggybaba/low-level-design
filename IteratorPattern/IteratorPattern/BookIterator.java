package IteratorPattern;

import java.util.List;

public class BookIterator implements Iterator {

	List<Book> booksList;
	int index=0;
	
	public BookIterator(List<Book> booksList) {
		this.booksList=booksList;
	}
	
	@Override
	public boolean hasNext() {
		return index<booksList.size();
	}

	@Override
	public Object next() {
		return booksList.get(index++);
	}

}
