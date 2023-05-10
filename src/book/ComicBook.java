package book;

import java.util.Scanner;

public class ComicBook extends Book implements BookInput{
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		this.setType(type);
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

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Type:"+this.type+"//Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
		
		
	}

}
