public class BookShopApp {
    public static void main(Strings[] args) {
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
    }
}