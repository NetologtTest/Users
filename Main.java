package Users;

public abstract class Main {
    public static String supplierReader = "Хорус";
    public static String administratorLibrarian = "Император";

    public static String book = "Ересь Хоруса";

    public static void main(String[] args) {
        User books = new User();
        books.overdueNotification(supplierReader, administratorLibrarian, book);
        books.luckyBooks(supplierReader, book);
        books.takeBook(supplierReader, administratorLibrarian, book);
    }

}
