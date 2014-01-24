/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler2;

/**
 * @author pwam
 */
public class Euler2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	
	double x = 1;
	double y = 2;
	double out = 0;
	double sum = 2;;

	while(out < 4000000) {
	    out = x + y;
	    x = y;
	    y = out;
	    
	    if(out % 2 == 0)
		System.out.println(sum+= out);
	}
    }
    
}
