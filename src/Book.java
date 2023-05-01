
public class Book {
	String name;
	String author;
	String publisher;
	
	public Book(String name,String author,String publisher) {
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		
	}
	public Book() {
		
	}
	public  void printInfo() {
		System.out.println("name:"+name +"author:"+author +"publisher:"+publisher);
	}
	
	
}
