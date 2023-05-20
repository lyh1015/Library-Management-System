package book;

import java.util.Scanner;

public class GeneralBook extends BookGenre {
	public String etctype;
	
	public void setetcType(String etctype) {
		this.etctype=etctype;
		
	}
	
	public void setetctype(String etctype) {
		this.etctype=etctype;
	}
	public void getBookInput(Scanner input) {
		setType("General");
		setBookGenreYN(input);
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
				
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
		
	}
		
		
		
	public  void printInfo() {
		
		System.out.println("Type:"+this.type+"//Genre:"+this.genre+"//Type of etc:"+this.etctype+ "//Book name:"+this.name+" //Book author:"+this.author +" //Book publisher:"+this.publisher);
	
	}

}
