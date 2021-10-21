import java.util.ArrayList;
import java.util.Arrays;

public class Bookstore {
    ArrayList<Book> inventory = new ArrayList<Book>();

    public Bookstore() {
        ArrayList<Book> inventory = new ArrayList<Book>();
        this.inventory = inventory;
    }

    public void addBook(Book b) {
        inventory.add(b);
    }

    public int numBooks() {
        return inventory.size();
    }

    public Book getBook(int index) {
        if (index < 0 || index >= inventory.size()) {
            return null;
        }

        return inventory.get(index);
    }

    public static void main(String[] args) {
        BookManager a = new BookManager();
        System.out.println(a.highestPricedBook(new ArrayList<Book>(Arrays.asList(new Book("Book 1", "Author 1", 12.99), new Book("Book 2", "Author 2", 15.99), new Book("Book 3", "Author 3", 9.99)))).toString());

        System.out.println(a.banBook(new ArrayList<Book>(Arrays.asList(new Book("Book 1", "Author 1", 12.99), new Book("Book 2", "Author 2", 15.99), new Book("Book 3", "Author 3", 9.99))), new Book("Book 1", "Author 1", 12.99)));

        Bookstore store = new Bookstore();

        store.addBook(new Book("Book 1", "Author 1", 12.99)); store.addBook(new Book("Book 2", "Author 2", 15.99));
        store.addBook(new Book("Book 3", "Author 3", 9.99));
        System.out.println(a.bookstoreValue(store));
    }
}