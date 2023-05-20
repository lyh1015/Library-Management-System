package book;

import java.util.Scanner;

public class HistoryBook extends BookGenre {
String Historytype;
	
	public void settype(String Historytype) {
		this.Historytype=Historytype;
	}
	public void getBookInput(Scanner input) {
		setType("History");
		setBookFictionYN(input);
		System.out.println("1.Asia 2.Africa 3.America 4.Europe 5.Oceania");
		System.out.println("Select num for Book type(1 ~ 5):");

		int language=input.nextInt();
		switch(language){
		case 1:
			Historytype="Asia";
			this.settype(Historytype);
			break;
		case 2:
			Historytype="Africa";
			this.settype(Historytype);
			break;
			
		case 3:
			Historytype="America";
			this.settype(Historytype);
			break;
			
		case 4:
			Historytype="Europe";
			this.settype(Historytype);
			break;
		case 5:
			Historytype="Oceania";
			this.settype(Historytype);
			break;
									
		}		
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
	}
public  void printInfo() {
		
		System.out.println("Type:"+this.type+"//Genre:"+this.genre+"//Historytype:"+this.Historytype+ "//Book name:"+this.name+" //Book author:"+this.author +" //Book publisher:"+this.publisher);
	
	}


}
