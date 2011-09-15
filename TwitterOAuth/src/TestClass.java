import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.lang.StringUtils;

import edu.emory.mathcs.backport.java.util.Arrays;


public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String created_at = "Wed, Sep 14 11:14:16 EDT 2011";
		
		String[] xx = created_at.split(" ");
		
		System.out.println( Arrays.toString(xx));
		
		String time = xx[3];
		String year = xx[5];
		String temp = time;
		xx[3] = year;
		xx[5] = temp;
		
		
		System.out.print( Arrays.toString(xx));
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< xx.length; i++){
			if(i != 4){
				sb.append(xx[i]);
				sb.append(" ");
			}
		}
		sb.append("+0000");
		System.out.print( sb.toString());

	
	}
	
}
