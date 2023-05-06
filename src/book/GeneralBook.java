package book;

import java.util.Scanner;

public class GeneralBook extends Book{
	public String etctype;
	
	public void setetcType(String etctype) {
		this.etctype=etctype;
		
	}
	
	public void setetctype(String etctype) {
		this.etctype=etctype;
	}
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		this.setType(type);
		
		System.out.println("1.Science 2.Art 3.Literature 4.Philosophy");
		System.out.println("Select num for Book type(1 ~ 4):");

		int general=input.nextInt();
		switch(general){
		case 1:
			etctype="Science";
			this.setetctype(etctype);
			break;
		case 2:
			etctype="Art";
			this.setetctype(etctype);
			break;
			
		case 3:
			etctype="Literature";
			this.setetctype(etctype);
			break;
			
		case 4:
			etctype="Philosophy";
			this.setetctype(etctype);
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
		
		System.out.println("Type:"+this.type+"//Type of etc:"+this.etctype+ "//Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
	
	}

}
