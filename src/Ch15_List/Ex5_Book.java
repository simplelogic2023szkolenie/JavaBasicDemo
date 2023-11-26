package Ch15_List;

public class Ex5_Book {
    public Ex5_Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String title;
    public String author;
    public int yearOfPublication;

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + yearOfPublication +
                '}';
    }
}
