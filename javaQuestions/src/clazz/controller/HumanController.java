package clazz.controller;

import clazz.model.vo.Human;

public class HumanController {

	public void humanTester() {
		
		Human changSu = new Human("ChangSu", 172, 68);
		Human jiEun = new Human("JiEun", 165, 50);
		
		changSu.gainWeight(3);
		jiEun.loseWeight(2);
		
		System.out.println(changSu.toString());
		System.out.println(jiEun.toString());
		
	}
}
