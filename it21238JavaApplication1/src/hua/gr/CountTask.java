/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr;

/**
 *
 * @author it21238
 */
public class CountTask implements Runnable {
    private long countUntil;
    
    public  CountTask (long countUntil){
          this.countUntil=countUntil;
          
    }
    
    @Override
    public void run(){
        long sum = 0;
        for(int i=0; i< this.countUntil; i++){
            sum +=i;
        }
        System.out.println("sum="+sum);
    }
    
}
