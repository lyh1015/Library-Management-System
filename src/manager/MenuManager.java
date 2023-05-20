package manager;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		BookManager bookManager=new BookManager(input);

	    selectMenu(input,bookManager);
	
}
public static void showMenu() {
	System.out.println("**Library Management System Menu**");
	System.out.println("1.Adding a book");
	System.out.println("2.Delete a book");
	System.out.println("3.edit a book");
	System.out.println("4.view a book");		
	System.out.println("5.Exit");
	System.out.println("Select one number between 1-5:");
}
public static void selectMenu(Scanner input,BookManager bookManager) {
	int num=0;				
	while(num!=5) {
		try {
		showMenu();
	num=input.nextInt();
	switch(num) {
	case 1:
		bookManager.addBook();
		break;
	case 2:
		bookManager.deleteBook();
		break;
	case 3:
		bookManager.editBook();
		break;
	case 4:
		bookManager.viewBook();
		break;
		default:
			continue;
	}
		}catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 ~5!");
			if(input.hasNext()) {
				input.next();
			}
			num=-1;
			
			//System.exit(-1);
		}
}
}
}
