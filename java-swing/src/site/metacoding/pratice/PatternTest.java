package site.metacoding.pratice;

interface knife {
	void attack();

	void cook();

}

abstract class ?丮?? implements knife {

	@Override
	public void attack() {

	}
}

abstract class ?ο??? implements knife {
	@Override
	public void cook() {
	}
}

class back extends ?丮?? {
	public void cook() {
	}
}

class ?????? extends ?ο??? {
	public void attack() {
	}
}

public class PatternTest {

}
