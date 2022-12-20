package Users;

public interface Administrator {

    void givesBook(String reader, String administrator, String book);

    void overdueNotification(String reader, String administrator, String book);
}
