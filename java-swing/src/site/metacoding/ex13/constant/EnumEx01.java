package site.metacoding.ex13.constant;



// �������̽� ������ public satatic final �� ����
interface Direction {
	String LEFT ="left";
	String RIGHT = "right";
}


public class EnumEx01 {

	
	final static String LEFT = "left";
	
	public static void add(String direction) {

// "LEFT", "RIGHT"
		if (direction.equals("LEFT") || direction.equals("RIGHT")) {
			System.out.println("�ߵ��Ա�");
		} else {
			System.out.println("�� �߸��Է��߾�");

		}
	}

	public static void main(String[] args) {
		add(Direction.LEFT);
		add(Direction.RIGHT);

	}

}