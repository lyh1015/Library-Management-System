import java.util.Scanner;

public class MenuManeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner input=new Scanner(System.in);
		
				
		while(num!=6) {
		System.out.println("1.Adding a book");
		System.out.println("2.Delete a book");
		System.out.println("3.borrowing a book");
		System.out.println("4.Return a book");
		System.out.println("5.Show a menu");
		System.out.println("6.Exit");
		System.out.println("Select one number between 1-5:");
		num=input.nextInt();
		switch(num) {
		case 1:
			System.out.print("Book Name:");
			String Bookname=input.nextLine();
			input.nextLine();
			System.out.print("Book Author:");
			String BookAuthor=input.nextLine();
			System.out.print("Book Publisher:");
			String BookPublisher=input.nextLine();
			break;
		case 2:
		case 3:
		case 4:
			
			
		
		}
		}
	}

}
