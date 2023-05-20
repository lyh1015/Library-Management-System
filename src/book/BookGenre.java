package book;

import java.util.Scanner;

public class BookGenre extends Book {

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}
	public void setBookFictionYN(Scanner input) {
		char answer='x';
		while (answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N')
		{
			System.out.print("Is this book fiction?(Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				this.setGenre("Fiction");
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setGenre("Non-Fiction");
				break;
			}
			else {
				System.out.print("올바른 형식을 입력하시오.");
			}
		}

	}
}
