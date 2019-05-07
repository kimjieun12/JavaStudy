package inheritance;

public class Main {
	public static void main(String[] args) {
		Child[] cc1 = new Child[2];
		
		Child c1 = new Child();
		c1.b();
		cc1[0] = c1;
		
		Child2 c2 = new Child2();
		c2.b();
//		cc1[1] = c2; // Child 배열에 Child2 객체를 넣을 수 없음
		
		Parent[] pp1 = new Parent[2];
		Child p1 = new Child(); // Up Casting
		pp1[0] = p1;
		Child2 p2 = new Child2();
		pp1[1] = p2;
		
		
	}
}
