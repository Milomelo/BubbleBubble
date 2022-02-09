package site.metacoding.ex13.constant;



// 인터페이스 변수는 public satatic final 이 생략
interface Direction {
	String LEFT ="left";
	String RIGHT = "right";
}


public class EnumEx01 {

	
	final static String LEFT = "left";
	
	public static void add(String direction) {

// "LEFT", "RIGHT"
		if (direction.equals("LEFT") || direction.equals("RIGHT")) {
			System.out.println("잘들어왔군");
		} else {
			System.out.println("너 잘못입력했어");

		}
	}

	public static void main(String[] args) {
		add(Direction.LEFT);
		add(Direction.RIGHT);

	}

}
