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
public class Lab11ThreadsRunnableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        thread1 gui1=new thread1 ();
        gui1.setVisible(true);
        thread2 gui2=new thread2 ();
        gui2.setVisible(true);
        /*CounterA ca = new CounterA();
        CounterB cb = new CounterB();
        
        Thread t1 = new Thread(ca);
        Thread t2 = new Thread(cb);
        
        t1.start();
        t2.start();*/
    }
    
}
