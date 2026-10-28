// Printer class with synchronized method
class Printer {
    public synchronized void printDocument(String docName) {
        System.out.println(Thread.currentThread().getName() + " started printing: " + docName);
        try {
            Thread.sleep(2000); // simulate printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + docName);
    }
}

// Thread representing a user
class User extends Thread {
    private Printer printer;
    private String document;

    User(Printer printer, String document, String userName) {
        super(userName); // set thread name
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        printer.printDocument(document);
    }
}

// Main class
public class PrinterSyncDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Multiple users trying to print
        User u1 = new User(printer, "Doc1.pdf", "User1");
        User u2 = new User(printer, "Doc2.pdf", "User2");
        User u3 = new User(printer, "Doc3.pdf", "User3");

        u1.start();
        u2.start();
        u3.start();
    }
}
