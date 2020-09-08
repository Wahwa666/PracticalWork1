package pr1;


public class Main {

    public static void main(String[] args) {
        Ball b1= new Ball("Deflated", "white", "Footbal");
        Ball b2= new Ball("Normal", "white&black", "Volleyball");
        Ball b3= new Ball("Pumped", "red", "Footbal");

        b1.BallDescription();
        b2.BallDescription();
        b3.BallDescription();

        Book d1= new Book("old", "Stephen Edwin King", " The Dead Zone");
        Book d2= new Book("new", "Stephen Edwin King", " IT");
        Book d3= new Book("new", "Stephen Edwin King", " The Shining");

        d1.BookDescription();
        d2.BookDescription();
        d3.BookDescription();
    }

}

