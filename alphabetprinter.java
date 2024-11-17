import java.util.*;

public class alphabetprinter extends Thread {

    @Override
    public void run() {
        Random rand = new Random();
        Set<Character> printedChar = new HashSet<>();
        while (printedChar.size() < 26) {
            int ascii = rand.nextInt(26) + 65; 
            char letter = (char) ascii;
            if (!printedChar.contains(letter)) {
                printedChar.add(letter);
                System.out.print(letter + " ");

                try {
                    int sleepTime = rand.nextInt(900) + 100;
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) {
        alphabetprinter printerThread = new alphabetprinter();
        printerThread.start();
	
        try {
            printerThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }
        System.out.println("\nThread Completed!");
    }
}





