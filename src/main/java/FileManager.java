import java.util.ArrayList;
import java.util.List;

// Класс для работы с файловой системой или БД
class FileManager {
    private String directory;

    public FileManager(String directory) {
        this.directory = directory;
    }

    public void saveBook(IBook book) {
        // Реализация сохранения книги в файловой системе или БД
    }

    public List<IBook> loadBooks() {
        // Реализация загрузки книг из файловой системы или БД
        return new ArrayList<>();
    }
}
