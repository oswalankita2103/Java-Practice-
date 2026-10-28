public class StarPatternDelay {
    public static void main(String[] args) {
        try {
            for (int i = 3; i >= 1; i--) {   // rows: 3,2,1
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    Thread.sleep(2000); // 2 second delay
                }
                System.out.println(); // move to next line
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
