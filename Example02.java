
   class Father{
	private String name = "zhangjun";
	  public void introFather(){
		  Child child = new Child();
		  child.show();
	  }

    class Child{
    	void show(){
    		System.out.println(name + " ");
    	}
    }
   }
public class Example02 {
	public static void main(String[] args) {
	        Father father1 = new Father();
	        father1.introFather();
 
	}

}
