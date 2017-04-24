/**
 * this for files
 * @author Acer
 * 
 * @date Apr 25, 2017
 */
package three;

/**
 * this for classes
 */

	import two.Hello1;    //this statement allows to refer to classes which are declared in other packages to be accessed.
	// TODO: Auto-generated Javadoc

	/**
	 * The Class MainClass.
	 */
	public class MainClass {
	    
    	/**
    	 * The main method.
    	 *
    	 * @param args the arguments
    	 */
    	public static void main(String[] args) {
	    	Hello1 object1=new Hello1();         //in this it should print displayit of Hello1.
	    	object1.displayit();
	}
	}

