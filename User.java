package Users;

class User implements Reader, Librarian, BookSupplier, Administrator {


    @Override
    public void givesBook(String reader, String administrator, String book) {
        System.out.println("читатель " + reader + " берет книгу " + book + " у " + "администратора" + administrator);
    }

    @Override
    public void overdueNotification(String reader, String administrator, String book) {
        System.out.println("администратор " + administrator + " уведомляед о просрочке книги " + book + " " + "читатиля " + reader);
    }

    @Override
    public void luckyBooks(String bookSupplier, String book) {
        System.out.println("поставщик " + bookSupplier + " везет книгу " + book + " в библиотеку");
    }

    @Override
    public void OrderingBook(String librarian, String bookSupplier, String book) {
        System.out.println("библиотекарь " + librarian + " заказывает книгу " + book + " у поставщика " + bookSupplier);
    }


    @Override
    public void takeBook(String reader, String administrator, String book) {
        System.out.println("читатель " + reader + " берет книгу " + book + " у администратора " + administrator);
    }
}
