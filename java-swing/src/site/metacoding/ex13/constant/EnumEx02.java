package site.metacoding.ex13.constant;

enum Way {
	Left, Rifgt;
}

public class EnumEx02 {

	public static void add(Way way) {
		System.out.println(way);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Way.Rifgt);
		System.out.println(Way.Left);
	}

}
