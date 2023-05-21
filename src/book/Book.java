package book;

import java.util.Scanner;

import exception.InputEmptyException;



public abstract class Book implements BookInput{
	protected String type;
	protected String name;
	protected String author;
	protected String publisher;
	protected String genre;
	
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
	public void setName(String name) throws InputEmptyException{
		if(name.isEmpty()) {
			throw new InputEmptyException();
		}
		this.name=name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws InputEmptyException{
	if(author.isEmpty()) {
		throw new InputEmptyException();
	}
		this.author=author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) throws InputEmptyException{
		if(publisher.isEmpty()) {
			throw new InputEmptyException();
		}
		this.publisher = publisher;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public abstract void printInfo(); 
	public void setBookName(Scanner input) {
		String name="";
		input.nextLine();
		while(name.isEmpty()) {
			System.out.print("Book name:");
			name=input.nextLine();	
			try{
				this.setName(name);
			}catch(InputEmptyException e) {
				System.out.println("Name cannot be  empty");
				
			}
		}
	
	}
	public void setBookAuthor(Scanner input){
        String author="";
        while(author.isEmpty()) {
        	System.out.print("Book Author:");
    		author=input.nextLine();
    		try {
    			this.setAuthor(author);
    		}catch(InputEmptyException e) {
    			System.out.println("Author cannot be empty");
    			
    		}
        }
		
	}
	public void setBookPublisher(Scanner input){
        String publisher="";
        while(publisher.isEmpty()) {
        	System.out.print("Book Publisher:");
    		publisher=input.nextLine();
    		try {
    			this.setPublisher(publisher);
    		}catch(InputEmptyException e) {
    			System.out.println("Publisher cannot be empty");
    			
    		}
        }
		
	
		
	}
	
	public void getBookInput(Scanner input) {
	}
	


	
}
