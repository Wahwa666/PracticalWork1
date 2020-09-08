package pr1;

public class Book {
    private String state;
    private String publisher;
    private String author;

    public Book (String state, String publisher, String author) {
        this.state = state;
        this.publisher = publisher;
        this.author = author;
    }

    public String getName() {return state;}
    public String getColor() {return publisher;}
    public String getAppointment() {return author;}


    public void BookDescription ()
    {
        System.out.println(state + " " + publisher  + author);
    }

}
