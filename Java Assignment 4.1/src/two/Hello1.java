/**
 * this for files
 * @author Acer
 * 
 * @date Apr 25, 2017
 */
package two;

/**
 * this for classes
 */

	import one.Hello;    //this statement allows to refer to classes which are declared in other packages to be accessed.
	// TODO: Auto-generated Javadoc

	/**
	 * The Class Hello1.
	 */
	public class Hello1 extends Hello {     //here we are creating a subclass of the class extending
		
		/**
		 * Displayit.
		 */
		public void displayit(){        //displays the message " I am able to access it from class Hello1".
			display();
		}
		}

