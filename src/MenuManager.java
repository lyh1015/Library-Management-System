import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		BookManager bookManger=new BookManager(input);
		int num=0;
				
		while(num!=5) {
		System.out.println("**Library Management System Menu**");
		System.out.println("1.Adding a book");
		System.out.println("2.Delete a book");
		System.out.println("3.edit a book");
		System.out.println("4.view a book");		
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5:");
		num=input.nextInt();
		if(num==1) {
			bookManger.addBook();
		}	
		else if(num==2) {
			bookManger.deleteBook();
		}	
		else if(num==3) {
			bookManger.editBook();
		}	
		else if(num==4) {
			bookManger.viewBook();
		}
		else continue;
	}
}
	
}
