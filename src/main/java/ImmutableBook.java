// Класс ImmutableBook, реализующий интерфейс Book и представляющий неизменяемые объекты книги
final class ImmutableBook implements IBook {
    private final String title;
    private final String author;
    private final int year;

    public ImmutableBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }
}
