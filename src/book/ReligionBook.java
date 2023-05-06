package book;

import java.util.Scanner;

public class ReligionBook extends Book {
	String religiontype;
	
	public void setrtype(String religiontype) {
		this.religiontype=religiontype;
	}
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		this.setType(type);
		
		System.out.println("1.Buddhism 2.Christianity 3.Islam 4.Hinduism");
		System.out.println("Select num for Book type(1 ~ 4):");

		int religion=input.nextInt();
		switch(religion){
		case 1:
			religiontype="Buddhism";
			this.setrtype(religiontype);
			break;
		case 2:
			religiontype="Christianity";
			this.setrtype(religiontype);
			break;
			
		case 3:
			religiontype="Islam";
			this.setrtype(religiontype);
			break;
			
		case 4:
			religiontype="Hinduism";
			this.setrtype(religiontype);
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
		
		System.out.println("Type:"+this.type+"//religiontype:"+this.religiontype+ "//Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
	
	}

}
