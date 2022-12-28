
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Book> books = new ArrayList<Book>();
	Scanner in = new Scanner(System.in);
	boolean a = true;

	public Library() {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Book> books = new ArrayList<Book>();
	}

//add all necessary fields
	//add constructor
	//note: initialize required arraylists within the constructor

	//this method allows to add a new book to library
	//by adding a book into arraylist
	//note: it is not allowed to have the books with the same tittle (check for duplicates before adding a book)
	public void addBook(Book b) {
		for(int i=0; i<books.size(); i++ ){
			if(books.get(i).getTittle().equals(b.getTittle())){
				a=false;
				break;
			}

		}
		if(a==true){
			books.add(b);
			System.out.println("Book is added");
		}else if (a==false) {
			System.out.println("Book is already added");

		}

	}


	//this method allows to add a new student to library
	//by adding a student into arraylist
	//note: it is not allowed to have the students with the same id (check for duplicates before adding a book)
	public void addStudent(int id, String surname, String name, String group) {

			Student s = new Student(id, surname, name, group);
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getId() == id ){
					a = false;
					break;
				}

			}
			if (a == true) {
				students.add(s);
				System.out.println("Student is added");
				System.out.println(students.get(0).getId());
			} else if (a == false) {
				System.out.println("Student is already added");

			}

		}
	//this method allows to increase by one amount of a certain book in a library
	//after it returns back from a student
	public void increaseBookQuantity(Book b) {
		for(int i=0; i<books.size(); i++ ){
			if(books.get(i).getTittle()== (b.getTittle())) {
				int q= b.getQuantity()+1;
			} else{
				System.out.println("Cant found this book");
			}
			}
		}

	//this method allows to decrease by one amount of a certain book in a library
	//if its borrowed by a student
	public void decreaseBookQuantity(Book b) {
		for(int i=0; i<books.size(); i++ ){
			if(books.get(i).getTittle()== (b.getTittle())) {
				int q = b.getQuantity() - 1 ;
			}else {
				System.out.println("Cant found this book");
			}
		}

	}
	//this method allows to borrow a certain book by a certain student;
	// as well as here we have to decrease amount of taken book
	public void addBookToStudent() {
		for(int i = 0; i < students.size(); ++i){
			System.out.println(i+1 + " student: " + students.get(i).name);
		}
		int id = in.nextInt()-1;
		for(int i = 0; i < books.size(); ++i){
			System.out.println(i+1 + " book: " + books.get(i).tittle);
		}
		int bid = in.nextInt()-1;
		for(int i=0;i < students.size(); i++){
			for(int j=0; j < books.size();j++) {
				if(a==true){
					students.get(id).books.add(books.get(bid));



				}else{
					System.out.println("You already get this book");
				}
			}
		}


	}
	//this method allows to return a certain book by a certain student;
	// as well as here we have to increase amount of returned book
	public void returnBookFromStudent() {


		for(int i = 0; i < students.size(); ++i){
			System.out.println(i+1 + " student: " + students.get(i).name);
		}
		int id = in.nextInt()-1;

		for(int i = 0; i < students.get(id).books.size(); ++i){
			System.out.println(i+1 + " book: " + students.get(id).books.get(i).tittle);

		}
		int bid =  in.nextInt()-1;
		for(int i=0;i < students.size(); i++){
			for(int j=0; j < students.get(id).books.size();j++) {
				if(a==true){
					students.get(id).books.remove(bid);
					System.out.println("Book removed");


				}else{
					System.out.println("Good job");
				}
			}

		}
	}

	
	//this method allows to print info about all books in library,
	// including overall their amount and so on
	public void printBooksInformation() {

		for (int i = 0; i < books.size(); i++) {
			System.out.println("Tittle: "+books.get(i).getTittle());
			System.out.println("Author: "+books.get(i).getAuthor());
			System.out.println("ISBN: "+books.get(i).getIsbn());
			System.out.println("Year: " +books.get(i).getYear());
			System.out.println("Quantity: " +books.get(i).getQuantity());
		}
		
	}
	//this method allows to print info about all students in library,
	// including overall their amount and so on
	public void printStudentsInformation() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println("ID: " +students.get(i).getId());
			System.out.println("Surname: " +students.get(i).getSurname());
			System.out.println("Name: " +students.get(i).getName());
			System.out.println("Group: " +students.get(i).getGroup());

		}
	}
	//this method allows to show info about borrowed books of a certain student
	public void printStudentsBooks(int id) {

			for (int i = 0; i < students.size(); i++) {
				students.get(i).books.get(i).getTittle();
					System.out.println("Student: " +students.get(i).getName());
					System.out.println("Books: " +students.get(i).books.get(i).getTittle());
				}
			}
		



	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}


}
