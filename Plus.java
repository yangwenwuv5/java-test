
public class Plus implements Runnable{
	int count;
	public static int sum = 0;
	public Plus(int count){
		this.count = count;
	}
	public static void get(int court){
		sum +=court;
	}
	public void run(){
		int sum = 0;
		for(int i = count;i < count + 10; i++){
			sum += i;
		}
		get(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Plus p1 = new Plus(1);
         Plus p2 = new Plus(11);
         Plus p3 = new Plus(21);
         Plus p4 = new Plus(31);
         Plus p5 = new Plus(41);
         Plus p6 = new Plus(51);
         Plus p7 = new Plus(61);
         Plus p8 = new Plus(71);
         Plus p9 = new Plus(81);
         Plus p10 = new Plus(91);
         Thread thread1 = new Thread(p1);
         Thread thread2 = new Thread(p2);
         Thread thread3= new Thread(p3);
         Thread thread4 = new Thread(p4);
         Thread thread5 = new Thread(p5);
         Thread thread6 = new Thread(p6);
         Thread thread7 = new Thread(p7);
         Thread thread8 = new Thread(p8);
         Thread thread9 = new Thread(p9);
         Thread thread10 = new Thread(p10);
     	thread1.start();thread1.join();
		thread2.start();thread2.join();
		thread3.start();thread3.join();
		thread4.start();thread4.join();
		thread5.start();thread5.join();
		thread6.start();thread6.join();
		thread7.start();thread7.join();
		thread8.start();thread8.join();
		thread9.start();thread9.join();
		thread10.start();thread10.join();
         /*new Thread(p1).start();
         new Thread(p2).start();
         new Thread(p3).start();
         new Thread(p4).start();
         new Thread(p5).start();
         new Thread(p6).start();
         new Thread(p7).start();
         new Thread(p8).start();
         new Thread(p9).start();
         new Thread(p10).start();*/
         System.out.println(sum);
}
}