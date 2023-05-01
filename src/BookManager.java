import java.util.Scanner;

public class BookManager {
	 Book book;
	
	Scanner input;
	BookManager(Scanner input){
		this.input=input;
	}
	public void addBook() {
		book=new Book();
		System.out.print("Book name:");
		book.name=input.nextLine();	
		input.nextLine();
		System.out.print("Book Author:");
		book.author=input.nextLine();
		System.out.print("Book Publisher:");
		book.publisher=input.nextLine();
		
	}
	public void deleteBook() {
		
		System.out.print("Book name:");
		String bookname=input.nextLine();
		input.nextLine();
		if (book==null) {
			System.out.println("the book has not been registered");
			return;
		}
		if(book.name.equals(bookname)) {
			book=null;
			System.out.println("the book is deleted");
			
			
		}

}
	public void borrowingBook() {
		
		System.out.print("Book name:");
		
	}
	public  void viewBook() {
		
		System.out.print("Book name:");
		String bookname=input.nextLine();
		input.nextLine();
		if(bookname.equals(book.name)) {
			book.printInfo();						
		}	
	}
}
