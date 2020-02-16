// just to check if these are found
//Book class

public class BookStoreDB {
  private String isbn;
  private String publisher_name;
  private String author_name;
  private int book_year;
  private String book_title;
  private double book_price;


  public BookStoreDB(String isbn, String publisher_name, String author_name, int book_year,
      String book_title, double book_price) {
    this.isbn = isbn;
    this.publisher_name = publisher_name;
    this.author_name = author_name;
    this.book_year = book_year;
    this.book_title = book_title;
    this.book_price = book_price;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getPublisher_name() {
    return publisher_name;
  }

  public void setPublisher_name(String publisher_name) {
    this.publisher_name = publisher_name;
  }

  public String getAuthor_name() {
    return author_name;
  }

  public void setAuthor_name(String author_name) {
    this.author_name = author_name;
  }

  public int getBook_year() {
    return book_year;
  }

  public void setBook_year(int book_year) {
    this.book_year = book_year;
  }

  public String getBook_title() {
    return book_title;
  }

  public void setBook_title(String book_title) {
    this.book_title = book_title;
  }

  public double getBook_price() {
    return book_price;
  }

  public void setBook_price(double book_price) {
    this.book_price = book_price;
  }

}
