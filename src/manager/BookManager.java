package manager;
import java.util.Scanner;

import book.Book;
import book.GeneralBook;
import book.HistoryBook;
import book.LanguageBook;
import book.ReligionBook;

import java.util.ArrayList;

public class BookManager {
	ArrayList<Book> books=new ArrayList<Book>();	 	
	Scanner input;
	BookManager(Scanner input){
		this.input=input;
	}
	public void addBook() {
		int type=0;
		Book book;
		while(type!=1 &&type!=2&&type!=3&&type!=4) {
		System.out.println("1.for General:");
		System.out.println("2.for ReligionBook:");
		System.out.println("2.for LanguageBook:");
		System.out.println("2.for HistoryBook:");
		System.out.println("Select num for Book type(1 ~ 4):");
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
		else {
			System.out.print("Select num for Booktype between 1 ~ 4");
		}
		}				
	}
	public void deleteBook() {
		
		System.out.print("Book name:");
		String bookname=input.nextLine();
		input.nextLine();
		int index=-1;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName()==bookname) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			books.remove(index);
			System.out.println("the book has not been registered");
			return;
		}
	

}
	public void editBook() {
		
		System.out.print("Book name:");
		String bookname=input.nextLine();
		for(int i=0;i<books.size();i++) {
			Book book=books.get(i);
			if(book.getName()==bookname) {
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
						System.out.print("Book name:");
						String name=input.nextLine();	
						book.setName(name);
					}
					else if(num==2) {
						System.out.print("Book Author:");
						String author=input.nextLine();
						book.setAuthor(author);
					}
					else if(num==3) {
						System.out.print("Book Publisher:");
						String publisher=input.nextLine();
						book.setPublisher(publisher);
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
