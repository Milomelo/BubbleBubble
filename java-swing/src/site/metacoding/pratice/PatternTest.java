package site.metacoding.pratice;

interface knife {
	void attack();

	void cook();

}

abstract class ¿ä¸®»ç implements knife {

	@Override
	public void attack() {

	}
}

abstract class ½Î¿ò²Û implements knife {
	@Override
	public void cook() {
	}
}

class back extends ¿ä¸®»ç {
	public void cook() {
	}
}

class °ËÅõ»ç extends ½Î¿ò²Û {
	public void attack() {
	}
}

public class PatternTest {

}
