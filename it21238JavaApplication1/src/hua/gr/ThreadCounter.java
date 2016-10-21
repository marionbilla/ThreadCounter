/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr;

import hua.gr.CountTask;
import java.util.ArrayList;

/**
 *
 * @author it21238
 */
public class ThreadCounter {
    
    public static void main(String args[]){
        ArrayList<Thread> threads =new ArrayList<>();
        for (int i=0; i<500; i++){
            CountTask mTask = new CountTask(10000000+i);
            Thread worker= new Thread(mTask);
            worker.start();
            threads.add(worker);
            
        }
        int threadCount =0;
        do{
            threadCount = 0;
            for (Thread thread:threads){
                if (thread.isAlive()){
                    threadCount++;
                }
            }
            System.out.println("Thread alive:" +threadCount);
        }while(threadCount>0);
    }
    
    
}
