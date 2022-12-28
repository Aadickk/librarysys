import java.util.ArrayList;
import java.util.Scanner;

public class Student{
	String name;
	int id;
	String surname;
	String group;
	private Scanner in = new Scanner(System.in);
	ArrayList<Book> books = new ArrayList<>();

	 public Student(int id, String name, String surname, String group) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.group = group;
	}




	//add all necessary fields
	//add constructor
	//note: initialize an arraylist within the constructor
	//add getters and setters

	//this method allows to borrow book from a library
	//by adding book into arraylist
	//note: it is not allowed to have the same books (check for duplicates before adding a book)
	public void  borrowBook() {
		Library l = new Library();

		}


	//this method allows to return book from student to library
	//by removing selected book from arraylist
	public void returnBook(/*add params here*/) {

	}
	
	//this method allows to print the list of borrowed books
	public void printBooks() {
		
	}



	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getSurname() {

		return surname;
	}

	public void setSurname(String surname) {

		this.surname = surname;
	}

	public String getGroup() {

		return group;
	}

	public void setGroup(String group) {

		this.group = group;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", group='" + group + '\'' +
				", in=" + in +
				'}';
	}
}
