public class Main
{
	public static void main(String[] args) {
		Mother m = new Mother();
		m.show();
		Mother m1 = new Child(); //polymorphism
		m1.show();
		Child c = new Child();
		c.show();
// 		Child c1 = new Mother();  //This will give error ...
            // we can call child class function using mother class refernce but not vice-versa
// 		c1.show();
		
	}
}
