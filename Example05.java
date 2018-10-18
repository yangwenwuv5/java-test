
public class Example05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Handout s1 = new Handout();
         Handout s2 = new Handout();
         Handout s3 = new Handout();
         new Thread(s1,"teacher-1").start();
         new Thread(s2,"teacher-2").start();
         new Thread(s3,"teacher-3").start();
	}

}
class Handout implements Runnable {
    int testpaper = 80;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(testpaper>0){
			System.out.println(Thread.currentThread().getName() + "正在分发第 " + testpaper-- +" 份试卷");
		}
	}
	
}