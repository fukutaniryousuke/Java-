package jp.example;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name + "情熱的に踊った！");
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
}
