import javax.swing.plaf.IconUIResource;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>() ;

  books.add(new Book("Zorba",400,"Nikos Kazancakis","1946"));
  books.add(new Book("Cesur Yeni Dünya",280,"Aldous Huxley","1932"));
  books.add(new Book("Suç ve Ceza",550,"Fyodor Dostoyevski","1866"));
  books.add(new Book("Satranç",80,"Stefan Zweig","1941"));
  books.add(new Book("Anna Karenina",800 ,"Lev Tolstoy","1877"));

  int count1 = 0;

        for (Book book : books){
            count1++;
            System.out.println(count1+ " - " + book.getName());
        }

        System.out.println("######");

        TreeSet<Book> books2 = new TreeSet<>(new OrderPage()) ;

        books2.add(new Book("Zorba",400,"Nikos Kazancakis","1946"));
        books2.add(new Book("Cesur Yeni Dünya",280,"Aldous Huxley","1932"));
        books2.add(new Book("Suç ve Ceza",550,"Fyodor Dostoyevski","1866"));
        books2.add(new Book("Satranç",80,"Stefan Zweig","1941"));
        books2.add(new Book("Anna Karenina",800 ,"Lev Tolstoy","1877"));

      int count2 = 0;

        for (Book book : books2){
            count2++;
            System.out.println(count2+ " - " + book.getPage() + " - "  + book.getName() );
        }



    }
}