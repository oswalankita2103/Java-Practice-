class FileResource {
    private boolean isReading = false;
    private boolean isWriting = false;

    // Reader method
    public synchronized void startReading(String readerName) throws InterruptedException {
        while (isWriting) {  // if writer is writing, reader must wait
            wait();
        }
        isReading = true;
        System.out.println(readerName + " started reading...");
    }

    public synchronized void stopReading(String readerName) {
        System.out.println(readerName + " finished reading.");
        isReading = false;
        notifyAll(); // notify waiting writers
    }

    // Writer method
    public synchronized void startWriting(String writerName) throws InterruptedException {
        while (isWriting || isReading) { // if already writing or reading, writer waits
            wait();
        }
        isWriting = true;
        System.out.println(writerName + " started writing...");
    }

    public synchronized void stopWriting(String writerName) {
        System.out.println(writerName + " finished writing.");
        isWriting = false;
        notifyAll(); // notify waiting readers/writers
    }
}

// Reader thread
class Reader extends Thread {
    private FileResource resource;
    private String name;

    Reader(FileResource resource, String name) {
        this.resource = resource;
        this.name = name;
    }

    public void run() {
        try {
            resource.startReading(name);
            Thread.sleep(2000); // simulate reading
            resource.stopReading(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Writer thread
class Writer extends Thread {
    private FileResource resource;
    private String name;

    Writer(FileResource resource, String name) {
        this.resource = resource;
        this.name = name;
    }

    public void run() {
        try {
            resource.startWriting(name);
            Thread.sleep(3000); // simulate writing
            resource.stopWriting(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Main class
public class ReaderWriterDemo {
    public static void main(String[] args) {
        FileResource file = new FileResource();

        Reader r1 = new Reader(file, "Reader1");
        Reader r2 = new Reader(file, "Reader2");
        Writer w1 = new Writer(file, "Writer1");
        Writer w2 = new Writer(file, "Writer2");

        r1.start();
        r2.start();
        w1.start();
        w2.start();
    }
}
