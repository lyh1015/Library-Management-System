package book;

import java.util.Scanner;

public class LanguageBook extends BookGenre {
String Languagetype;
	
	public void setltype(String Languagetype) {
		this.Languagetype=Languagetype;
	}
	
	public void getBookInput(Scanner input) {
		setType("Language");
		setBookGenreYN(input);
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
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
	}
public  void printInfo() {
		
		System.out.println("Type:"+this.type+"//Genre:"+this.genre+"//Languagetype:"+this.Languagetype+ "//Book name:"+this.name+" //Book author:"+this.author +" //Book publisher:"+this.publisher);
	
	}


}

