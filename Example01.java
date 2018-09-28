    class Student{
    	String name;
    	int score;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public Student(String name, int score ){
			this.name = name;
			this.score = score;
			System.out.println("有参构造");
		}
		public  Student(){
			System.out.println("无参构造");
		}
		public  void Speak(){
			System.out.println(name + " " + score);
		}
    	
    }
public class Example01 {


	public static void main(String[] args) {
		Student stu1 = new Student("zhangsan",80);
		Student stu2 = new Student();
		//stu2.name = "lisi";
		//stu2.score = 100;
		stu2.setName("lisi");
		stu2.setScore(100);
		stu1.Speak();
		stu2.Speak();

	}

}
