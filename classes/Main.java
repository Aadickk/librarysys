import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//create a scanner
		
		//create an instance of library class



		Library l=	new Library();
		//declare required variables
		int id = 0;
		String name;
		String surname;
		String group;
		String tittle;
		String author;
		String isbn;
		int year;
		int quantity;

		int choice = -1;

		
		while (choice != 0) {
			System.out.println("Welcome to the AITU Library");
			System.out.println("1. Add book");
			System.out.println("2. Add student");
			System.out.println("3. Give book to student");
			System.out.println("4. Return book from student");
			System.out.println("5. Print books information");
			System.out.println("6. Print students information");
			System.out.println("7. Print student's books");
			System.out.println("0. Exit");
			
			choice = in.nextInt();
			in.nextLine();
			
			switch (choice) {
				case 1:
				//here you have to add an opportunity to create an instance of a book
				//and then you have to call corresponding method from library object in order to add created book
					System.out.println("enter tittle, author, isbn, year and quantity");
					tittle=in.nextLine();
					author=in.nextLine();
					isbn=in.nextLine();
					year= Integer.parseInt(in.nextLine());
					quantity= Integer.parseInt(in.nextLine());
					Book s = new Book (tittle, author, isbn, year, quantity);
					l.addBook(s);
					break;
				case 2:
					System.out.println("Enter id, surname ,name, group");
					id= Integer.parseInt(in.nextLine());
					surname= in.nextLine();
					name=in.nextLine();
					group=in.nextLine();
					l.addStudent(id, surname, name, group);


					break;
				case 3:
					l.addBookToStudent();


					break;
				case 4:

					l.returnBookFromStudent();

					break;
				case 5:

					l.printBooksInformation();

					break;
				case 6:
					l.printStudentsInformation();
					break;
				case 7:
				l.printStudentsBooks(id);
					break;
			}
		}

	}
}
