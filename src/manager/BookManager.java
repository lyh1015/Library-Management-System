package manager;
import java.util.Scanner;

import book.Book;
import book.BookInput;
import book.ComicBook;
import book.GeneralBook;
import book.HistoryBook;
import book.LanguageBook;
import book.ReligionBook;

import java.util.ArrayList;

public class BookManager {
	ArrayList<BookInput> books=new ArrayList<BookInput>();	 	
	Scanner input;
	BookManager(Scanner input){
		this.input=input;
	}
	public void addBook() {
		int type=0;
		BookInput book;
		while(type!=1 &&type!=2&&type!=3&&type!=4) {
		System.out.println("1.for General:");
		System.out.println("2.for ReligionBook:");
		System.out.println("3.for LanguageBook:");
		System.out.println("4.for HistoryBook:");
		System.out.println("5.for ComicBook:");
		System.out.println("Select num for Book type(1 ~ 5):");
		type=input.nextInt();
		if(type==1) {
			book=new GeneralBook();
			book.getBookInput(input);
			books.add(book);
		    break;
		}
		else if(type==2) {
			book=new ReligionBook();
			book.getBookInput(input);
			books.add(book);
			break;
		}
		else if(type==3) {
			book=new LanguageBook();
			book.getBookInput(input);
			books.add(book);
			break;
		}
		else if(type==4) {
			book=new HistoryBook();
			book.getBookInput(input);
			books.add(book);
			break;
		}
		else if(type==5) {
			book=new ComicBook();
			book.getBookInput(input);
			books.add(book);
			break;
		}
		else {
			System.out.print("Select num for Booktype between 1 ~ 5");
		}
		}				
	}
	public void deleteBook() {
		input.nextLine();
		System.out.print("Book name:");
		String bookname=input.nextLine();
		int index=-1;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName().equals(bookname)) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			books.remove(index);
			System.out.println("This book has been deleted.");
			return;
		}
	

}
	public void editBook() {
		input.nextLine();
		System.out.print("Book name:");
		String bookname=input.nextLine();
		for(int i=0;i<books.size();i++) {
			BookInput bookInput=books.get(i);
			if(bookInput.getName().equals(bookname)) {
				int num=-1;
				while(num!=4) {
					System.out.println("--Book Info Edit Menu--");
					System.out.println("1.Edit name");
					System.out.println("2.Edit Author");
					System.out.println("3.Edit Publisher");
					System.out.println("4.Exit");
					System.out.println("Select one number between 1~4:");
					num=input.nextInt();
			
					if(num==1) {
					    input.nextLine();
						System.out.println("Book name:");
						String name=input.nextLine();	
						bookInput.setName(name);
					}
					else if(num==2) {
						input.nextLine();
						System.out.println("Book Author:");
						String author=input.nextLine();
						bookInput.setAuthor(author);
					}
					else if(num==3) {
						input.nextLine();
						System.out.println("Book Publisher:");
						String publisher=input.nextLine();
						bookInput.setPublisher(publisher);
					}
					else {
						continue;
					}//if
												
				}//while
				break;
			}//if			
		}//for
	}
	public  void viewBook() {
		
		System.out.println("# of registered book:"+books.size());		
		for(int i=0;i<books.size();i++) {
			books.get(i).printInfo();
		}
    	}
}
