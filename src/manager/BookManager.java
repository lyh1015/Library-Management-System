package manager;
import java.util.Scanner;

import book.Book;
import book.BookInput;
import book.ComicBook;
import book.GeneralBook;
import book.HistoryBook;
import book.LanguageBook;
import book.ReligionBook;
import exception.InputEmptyException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BookManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2193043882918485186L;
	ArrayList<BookInput> books=new ArrayList<BookInput>();	 	
	transient Scanner input;
	BookManager(Scanner input){
		this.input=input;
	}
	public void addBook() {
		
		int type=0;
		BookInput book;
		while(type!=1 &&type!=2&&type!=3&&type!=4) {
			try {
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
		}catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 ~5!(type)");
			if(input.hasNext()) {
				input.next();
			}
		     type=-1;
		}
		}
		
		}
		
	
	public void deleteBook() {
		input.nextLine();
		System.out.print("Book name:");
		String bookname=input.nextLine();
		int index=findIndex(bookname);	
		removoefromBook(index,bookname);		
}
	public int findIndex(String bookname) {
		int index=-1;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName().equals(bookname)) {
				index=i;
				break;
			}
		}
		return index;
	}
	public int removoefromBook(int index,String bookname) {
		if(index>=0) {
			books.remove(index);
			System.out.println("This book has been deleted.");
			return 1;
		}
		else {
			System.out.println("The book has not been registered");
			return -1;
		}
		
	}
	public void editBook() {
		input.nextLine();
		System.out.print("Book name:");
		String bookname=input.nextLine();
		for(int i=0;i<books.size();i++) {
			BookInput book=books.get(i);
			if(book.getName().equals(bookname)) {
				
				int num=-1;
				while(num!=4) {
					showEditMenu();
					num=input.nextInt();
					switch(num) {
					case 1:
						 book.setBookName(input);
						break;
					case 2:
						
						book.setBookAuthor(input);
						
						break;
					case 3:
						book.setBookPublisher( input);
						break;
					default:
						continue;
							
					}						
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
	public void setBookName(BookInput book,Scanner input) throws InputEmptyException {
		 input.nextLine();
			System.out.println("Book name:");
			String name=input.nextLine();	
			book.setName(name);
	}
	public void setBookAuthor(BookInput book,Scanner input) throws InputEmptyException {
		input.nextLine();
		System.out.println("Book Author:");
		String author=input.nextLine();
		book.setAuthor(author);
	}
	public void setBookPublisher(BookInput book,Scanner input) throws InputEmptyException {
		input.nextLine();
		System.out.println("Book Publisher:");
		String publisher=input.nextLine();
		book.setPublisher(publisher);
	}
	public int size() {
		return books.size();
	}
	public BookInput get(int index) {
		return (Book) books.get(index);
	}
	public void showEditMenu() {
		System.out.println("--Book Info Edit Menu--");
		System.out.println("1.Edit name");
		System.out.println("2.Edit Author");
		System.out.println("3.Edit Publisher");
		System.out.println("4.Exit");
		System.out.println("Select one number between 1~4:");
	}
}
