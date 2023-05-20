package book;

import java.util.Scanner;

public class ComicBook extends BookGenre {
	public void getBookInput(Scanner input) {
		
		setType("Comic");
		setBookGenreYN(input);
		setBookName(input);
		setBookAuthor(input);
		setBookPublisher(input);
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Type:"+this.type+"//Genre:"+this.genre+"//Book name:"+this.name+" //Book author:"+this.author +" //Book publisher:"+this.publisher);
		
		
	}

}
