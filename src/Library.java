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
		Book book1=new Book("ȥ�� �����ϴ� �ڹ�","�ſ��","�Ѻ��̵��","2019.06.10");
		Book book2=new Book("����� Java Programming","���翬","���ο����","2018.06.20");
		
		library.addBook(book1);
		library.addBook(book2);
		
		
	
	}

}
