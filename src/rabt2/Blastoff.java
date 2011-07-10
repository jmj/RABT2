/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabt2;

/**
 *
 * @author jjones
 */
public class Blastoff implements Runnable {
    
    @Override
    public void run() {
        for (int count=5;count>0; count--) {
            System.out.format("%s: %d\n", Thread.currentThread().getName(),
                    count);
        }
        
    }
    
}
