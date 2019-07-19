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
public class CounterA implements Runnable {

    public void run() {
        increment();
    }

    //user defined function to increase counter
    public void increment(){
        for (int c = 0; c <= 1000; c++) {
            System.out.println("CounterA: increment() " + c);

            //sleep 200 milisecond
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Increment Exception: " + e);
            }

        }//for
    }//end of increase
}
