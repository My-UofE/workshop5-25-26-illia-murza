public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        String s = "";
        boolean first = true;
        for (int i = 0; i < authors.length; i++) {
            if (!first) { s += ","; }
            s += String.valueOf(authors[i]);
            first = false;
        }
        return s;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String s = "";
        boolean first = true;
        for (int i = 0; i < authors.length; i++) {
            if (!first) { s += ","; }
            s += String.valueOf(authors[i]);
            first = false;
        }
        return "Book[name="+name+",authors={"+s+"},price="+price+",qty="+qty+"]";
    }

    public String getAuthorNames() {
        String s = "";
        boolean first = true;
        for (int i = 0; i < authors.length; i++) {
            if (!first) { s += ","; }
            s += String.valueOf(authors[i].getName());
            first = false;
        }
        return s;
    }
}