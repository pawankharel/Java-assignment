package constructor;

public class OutputBook {

    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Java");

        book.displayPage();
        book.displayPage("Python");
    }
}
