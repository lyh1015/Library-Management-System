package book;

import java.util.Scanner;

public class HistoryBook extends Book implements BookInput{
String Historytype;
	
	public void sethtype(String Historytype) {
		this.Historytype=Historytype;
	}
	public void getBookInput(Scanner input) {
		input.nextLine();
		System.out.print("Type:");
		String type=input.nextLine();
		this.setType(type);
		
		System.out.println("1.Asia 2.Africa 3.America 4.Europe 5.Oceania");
		System.out.println("Select num for Book type(1 ~ 5):");

		int language=input.nextInt();
		switch(language){
		case 1:
			Historytype="Asia";
			this.sethtype(Historytype);
			break;
		case 2:
			Historytype="Africa";
			this.sethtype(Historytype);
			break;
			
		case 3:
			Historytype="America";
			this.sethtype(Historytype);
			break;
			
		case 4:
			Historytype="Europe";
			this.sethtype(Historytype);
			break;
		case 5:
			Historytype="Oceania";
			this.sethtype(Historytype);
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
		
		System.out.println("Type:"+this.type+"//Historytype:"+this.Historytype+ "//Book name:"+this.name+" //Book author:"+author +" //Book publisher:"+publisher);
	
	}

}
