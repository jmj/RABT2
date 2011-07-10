/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabt2;

/**
 *
 * @author jjones
 */
public class RABT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Blastoff(), "Thread 1");
        Thread thread2 = new Thread(new Blastoff(), "Thread 2");
        Thread thread3 = new Thread(new Blastoff(), "Thread 3");
        Thread thread4 = new Thread(new Blastoff(), "Thread 4");
        Thread thread5 = new Thread(new Blastoff(), "Thread 5");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
