// Класс BookFactory для создания объектов Book
class BookFactory {
    public static IBook createBook(String title, String author, int year) {
        return new BookBuilder()
                .setTitle(title)
                .setAuthor(author)
                .setYear(year)
                .build();
    }
}
