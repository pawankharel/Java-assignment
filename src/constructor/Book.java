package constructor;

public class Book {

    int pageNo = 55;

    public Book(){
        System.out.println("This is non paramererized constructor: ");
    }
    public Book(String name){
        System.out.println("Book name is : "+name);
    }

    public void displayPage(){
        System.out.println("pageNo = " + pageNo);
    }
    public void displayPage(String name){
        System.out.println("Book name is : "+name);
    }
}
