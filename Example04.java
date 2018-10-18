
public class Example04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 100;
        Test3 s = new Test3();
        new Thread(s).start();
        while(count>0)
        {
        	System.out.println("main"+ count--);
        }
      
	}

}
 class Test3 implements Runnable {
   int count = 50;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count>0){
			System.out.println("new" + count--);
		}
		
	}
	
}
 