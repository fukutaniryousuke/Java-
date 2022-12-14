package jp.example;

public class SuperHero extends Hero {
	boolean flying;
	
	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//runをオーバーライド
	public void run() {
		System.out.println(this.getName() + "は、撤退した！");
	}
	
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	
	public SuperHero() {
		super();
	}
}
