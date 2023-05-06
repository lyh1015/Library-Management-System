package book;

import java.util.Scanner;

public class LanguageBook extends Book {
String Languagetype;
	
	public void setltype(String Languagetype) {
		this.Languagetype=Languagetype;
	}
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		this.setType(type);
		
		System.out.println("1.Korean 2.Chinese 3.Japanese 4.English");
		System.out.println("Select num for Book type(1 ~ 4):");

		int language=input.nextInt();
		switch(language){
		case 1:
			Languagetype="Korean";
			this.setltype(Languagetype);
			break;
		case 2:
			Languagetype="Chinese";
			this.setltype(Languagetype);
			break;
			
		case 3:
			Languagetype="Japanese";
			this.setltype(Languagetype);
			break;
			
		case 4:
			Languagetype="English";
			this.setltype(Languagetype);
			break;
									
		}
		input.nextLine();				
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
public  void printInfo() {
		
		System.out.println("Type:"+this.type+"//Languagetype:"+this.Languagetype+ "//Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
	
	}
}
