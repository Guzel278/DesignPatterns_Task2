import java.util.List;
public class BookClient {
    public static void main(String[] args) {
        // Создание неизменяемого объекта книги с использованием шаблона Builder
        IBook book = new BookBuilder()
                .setTitle("The Great Gatsby")
                .setAuthor("F. Scott Fitzgerald")
                .setYear(1925)
                .build();

        // Создание объекта книги с использованием фабрики
        IBook anotherBook = BookFactory.createBook("To Kill a Mockingbird", "Harper Lee", 1960);

        // Работа с файловой системой или БД
        FileManager fileManager = new FileManager("/path/to/directory");
        fileManager.saveBook(book);

        List<IBook> loadedBooks = fileManager.loadBooks();
        for (IBook loadedBook : loadedBooks) {
            System.out.println("Loaded Book: " + loadedBook.getTitle());
        }
    }
}