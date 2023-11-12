// Класс BookBuilder для создания неизменяемых объектов Book с использованием шаблона Builder
public class BookBuilder {
    private String title;
    private String author;
    private int year;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public IBook build() {
        return new ImmutableBook(title, author, year);
    }
}
