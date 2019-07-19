/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11.threads.runnablepackage;

/**
 *
 * @author Dr. Kamruddin Nur
 */
public class CounterB implements Runnable {

    public void run() {
        decrement();
    }

    //user defined function to decrease counter
    public void decrement() {
        for (int c = 1000; c >= 0; c--) {
            System.out.println("CounterB: decrement() " + c);

//sleep 100 mili second
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("decrement Exception: " + e);
            }
        }
    }//end of decrease
}
