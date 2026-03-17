import java.util.ArrayList;

public class BookShopApp {
    public static void main(String[] args) {
        // create the stocklist as an ArrayList to store the books
        ArrayList<Book> stocklist = new ArrayList<>();

        // to add book 1
        // first create necessary 'authors' array
        Author [] authors1 = {new Author("Robert Nisbet", "", 'u')};

        // we can then create book1
        Book book1 = new Book("Data Mining Handbook", authors1, 27.95, 10);

        // finally add book 1 into the ArrayList
        stocklist.add(book1);

        // create more books, and add them into the array
        Author [] authors2 = {new Author("Roger Hutty", "", 'u')};
        Book book2 = new Book("Mastering COBOL", authors2, 4.95, 10);
        stocklist.add(book2);

        Author [] authors3 = {new Author("Paul Murrill", "", 'u')};
        Book book3 = new Book("Intro to COBOL", authors3, 7.35, 4);
        stocklist.add(book3);

        Author [] authors4 = {new Author("Andy Oram", "", 'u')};
        Book book4 = new Book("Making Software", authors4, 35.00, 5);
        stocklist.add(book4);

        Author [] authors5 = {new Author("James Nino", "", 'u'), new Author("Frederick Hosch", "", 'u')};
        Book book5 = new Book("OO Design Using Java", authors5, 30.00, 6);
        stocklist.add(book5);

        Author [] authors6 = {new Author("David Barnes", "", 'u'), new Author("Michael Kolling", "", 'u')};
        Book book6 = new Book("Objects First with Java", authors6, 29.50, 4);
        stocklist.add(book6);

        for (Book b : stocklist) {
            System.out.printf(" | %-23s | %-28s | %6.2f | %03d | %n", b.getName(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }

        String searchFor = "making software";
        System.out.println("Search for term(s) '" + searchFor + "' in title...");

        for (int i = 0; i < stocklist.length; i++) {
            if (searchFor.equals(stocklist.getName().toLowerCase())) {
                stocklist.setQty();
            }
        }
    }
}