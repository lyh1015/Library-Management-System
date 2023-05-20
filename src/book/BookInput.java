package book;

import java.util.Scanner;

import exception.AuthorFormatException;





public interface BookInput {
	public void getBookInput(Scanner input);

	public String getName();
	public void setName(String name);
	public void setAuthor(String author) ;
	public void setPublisher(String publisher);
	public  void printInfo();
	public void setBookName(Scanner input);
	public void setBookAuthor(Scanner input) ;
	public void setBookPublisher(Scanner input);
	}
