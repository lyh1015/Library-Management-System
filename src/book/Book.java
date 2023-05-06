package book;

import java.util.Scanner;

public class Book {
	protected String type;
	protected String name;
	protected String author;
	protected String publisher;
	
	public Book(String name,String author,String publisher) {
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		
	}
	public Book(String type,String name,String author,String publisher) {
		this.type=type;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		
	}
	
	
	public Book() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public  void printInfo() {
	
		System.out.println("Type:"+this.type+" //Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
	
	}
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		System.out.print("Book name:");
		String name=input.nextLine();	
		this.setName(name);
		System.out.print("Book Author:");
		String author=input.nextLine();
		this.setAuthor(author);
		System.out.print("Book Publisher:");
		String publisher=input.nextLine();
		this.setPublisher(publisher);
	}
	
	
}
