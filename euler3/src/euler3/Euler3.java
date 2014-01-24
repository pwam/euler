/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler3;

/**
 * @author pwam
 */
import java.lang.Long;
public class Euler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	
	long x = 600851475143L;
	int y = 2;
	primes(x, y);
	System.out.print(" = " + x);
	System.out.println();
    }
    
    public static void primes(long x, int y) {
	
	if(y > x)
	    return ;
	else if(x % y == 0) {
	    x = (x/y);
	    System.out.print(y + " x ");
	    y = 2;
	    primes(x, y);
	}
	else
	    primes(x, y+1);
    }
    
}
