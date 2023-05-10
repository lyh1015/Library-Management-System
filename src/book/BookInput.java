package book;

import java.util.Scanner;

public interface BookInput {
	public void getBookInput(Scanner input);

	public String getName();
	public void setName(String name);
	public void setAuthor(String author);
	public void setPublisher(String publisher);
	public  void printInfo();
	}
