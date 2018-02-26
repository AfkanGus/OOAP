package p_596;

/**
 * Created by Taly on 01.02.2018.
 */
public class FlyTest3 {
	public static void main(String[] args) {
		Jet jet1 = new Jet();
		jet1.speed = 212;           // без инкапсуляции, при открытом (public) поле (speed) класса (Airplane)
		// возможно прямое изменение значения поля в суперклассе.
		System.out.println(jet1.speed);

		// при использовании инкапсуляции защищается информация в переменной класса от прямого изменения.
		// ее изменения происходят только через определенные методы.
		Jet jet2 = new Jet();
		jet2.setSpeed(212);
		System.out.println(jet2.getSpeed());
	}
}
