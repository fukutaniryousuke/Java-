package jp.example;

public class Hero extends Character {
	private int hp;
	private String name;
	private Sword sword;//剣を装備
	static int money;
	
	public static void setrrRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		this.name = name;
	}
	
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
	
	public Sword getSword() { return this.sword; }
	public void setSword(Sword sword) { this.sword = sword; }
	
	public void attack(Monster m) {
		System.out.println(this.name + "は" + this.sword.name + "で、攻撃した！");
		System.out.println("敵に" + this.sword.damage + "ポイントのダメージをあたえた！");
		m.hp -= this.sword.damage;
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("５のダメージ！");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAMEOVERです。");
	}
	
	public Hero (String name) { //引数nameを受け取るコンストラクタ
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}
	
	public Hero() { //引数なしのコンストラクタ
		this("ダミー");
	}
	
}
