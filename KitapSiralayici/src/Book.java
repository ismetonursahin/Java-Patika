public class Book implements Comparable<Book> {

    private String name;
    private int page;
    private String author;
    private String releaseDate;

    public Book(String name, int page ,String author ,String releaseDate) {
        this.name= name;
        this.page=page;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int compareTo(Book o1) {
        return getName().compareTo(o1.getName());
    }
}
