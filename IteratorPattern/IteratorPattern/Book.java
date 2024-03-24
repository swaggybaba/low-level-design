package IteratorPattern;

public class Book {
	
	int price;
	String bookName;
	
	public Book(int price,String bookName) {
		this.price=price;
		this.bookName=bookName;
	}
	
	@Override
	public String toString() {
		return price+" "+bookName;
	}
}
