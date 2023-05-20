package book;

import java.util.Scanner;

public class ReligionBook extends BookGenre {
	String religiontype;
	
	
	
	public void setrtype(String religiontype) {
		this.religiontype=religiontype;
	}
	public void getBookInput(Scanner input) {
		setType("Religion");
		setBookGenreYN(input);
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
				
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
		
	}
public  void printInfo() {
		
		System.out.println("Type:"+this.type+"//Genre:"+this.genre+"//religiontype:"+this.religiontype+ "//Book name:"+this.name+" //Book author:"+this.author +" //Book publisher:"+this.publisher);
	
	}

}
