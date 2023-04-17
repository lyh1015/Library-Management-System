import java.util.ArrayList;


public class Library {
	 private ArrayList<Book> books;
	

	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void removeBook(Book book) {
	        books.remove(book);
	    }
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library=new Library();
		Book book1=new Book("혼자 공부하는 자바","신용권","한빛미디어","2019.06.10");
		Book book2=new Book("든든한 Java Programming","심재연","연두에디션","2018.06.20");
		
		library.addBook(book1);
		library.addBook(book2);
		
		
	
	}

}
