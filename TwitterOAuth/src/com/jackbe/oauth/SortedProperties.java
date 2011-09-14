package com.jackbe.oauth;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class SortedProperties extends Properties {
	/**
	 * @lastModiification 09/14/2011  By JavierLeon@JackBe.com  
	 * @version version 1.1
	 * @author JackBe 	 
	 */
  public synchronized Enumeration keys() {
     Enumeration keysEnum = super.keys();
     Vector keyList = new Vector();
     while(keysEnum.hasMoreElements()){
       keyList.add(keysEnum.nextElement());
     }
     Collections.sort(keyList);
     return keyList.elements();
  }
 
}
