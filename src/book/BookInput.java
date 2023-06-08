package book;

import java.util.Scanner;

import exception.InputEmptyException;





public interface BookInput {
	public void getBookInput(Scanner input);
	public String getAuthor();
	public String getName();
	public String getPublisher();
	public String getType();
	public void setName(String name) throws InputEmptyException;
	public void setAuthor(String author) throws InputEmptyException;
	public void setPublisher(String publisher)throws InputEmptyException;
	public  void printInfo();
	public void setBookName(Scanner input);
	public void setBookAuthor(Scanner input) ;
	public void setBookPublisher(Scanner input);
	}
