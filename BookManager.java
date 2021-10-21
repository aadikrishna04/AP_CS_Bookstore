import java.util.ArrayList;

public class BookManager {
    public Book highestPricedBook(ArrayList<Book>list) {
        int highest = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).getPrice() > list.get(highest).getPrice()) {
                highest = i + 1;
            }
        }
        return list.get(highest);
    }

    public ArrayList<Book> banBook(ArrayList<Book> list, Book book) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(book.getTitle())) {
                list.remove(i);
            }
        }
        return list;
    }

    public double bookstoreValue(Bookstore store) {
        double totalPrice = 0;
        for (int i = 0; i < store.numBooks(); i++) {
            totalPrice += store.getBook(i).getPrice();
        }

        return totalPrice;
    }
}
