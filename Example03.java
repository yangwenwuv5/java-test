
public class Example03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test1 s = new Test1();
       Test2 m = new Test2();
       s.start();
       m.start();  
	}

}
class Test1 extends Thread {
	public void run(){
		while(true){
			System.out.println("Test1");
		}
	}
}
class Test2 extends Thread {
	public void run(){
		while(true){
			System.out.println("Test2");
		}
	}
}
