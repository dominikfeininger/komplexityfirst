package firstTest;

public class FirstJUnitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   
    public static void testOfGoogleCode(){
      System.Out.Println("testOfGoogleCode");
    }
	
	/**
	 * 
	 * @return Stirng Fertig
	 */
	public static String returnFertig(){
		return "Fertig";
	}
	
	/**
	 * 
	 * @return 5
	 */
	public static int return5(){
		return 5;
	}
	
	/**
	 * 
	 * @return 17.9
	 */
	public static double return179(){
		return 17.9;
	}
	
	/**
	 * 
	 *  @return NULL
	 */
	public static Object returnNull(){
		return null;
	}
	
	/**
	 * 
	 * @return initialized object
	 */
	public static Object returnNotNull(){
		Object obj = new Object();
		return obj;
	}

}
