package book;

import java.util.Scanner;

public class GeneralBook extends Book{
	public void getBookInput(Scanner input) {
		System.out.print("Book name:");
		String name=input.nextLine();	
		input.nextLine();
		this.setName(name);
		
		System.out.print("Book Author:");
		String author=input.nextLine();
		this.setAuthor(author);
		
		System.out.print("Book Publisher:");
		String publisher=input.nextLine();
		this.setPublisher(publisher);
	}

}
