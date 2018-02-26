package p_596;

/**
 * Created by Taly on 01.02.2018.
 */
public class Jet extends Airplane {
	private static final int MULTIPLIER = 2;

	public Jet() {
		super();// ключевое слово, обозначает класс от которого текущий класс (Jet)
				// наследует свое поведение (Airplane)
	}

	@Override
	public void setSpeed(int speed) {
		super.setSpeed(speed * MULTIPLIER);
	}

	public void accelerate(){
		super.setSpeed(getSpeed() * 2);
	}
}
