public class  Book  {
    String tittle;
    String author;
    String isbn;
    int year;
    int quantity;


    public Book(String tittle, String author, String isbn, int year, int quantity) {
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
    }

    public Book(String tittle) {
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                '}';
    }
    //add all necessary fields
	//add constructor
    //add getters and setters
    //add toString method
}
