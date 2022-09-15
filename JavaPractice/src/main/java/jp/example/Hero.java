package jp.example;

public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言
	Sword sword; //剣を装備
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "は" + this.sword.name + "で、攻撃した！");
		System.out.println("敵に" + this.sword.damage + "ポイントのダメージをあたえた！");
		m.hp -= this.sword.damage;
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public void sleep() {
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
	
	
	public Hero(String name) { //引数nameを受け取るコンストラクタ
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}
	
	public Hero() { //引数なしのコンストラクタ
		this("ダミー");
	}
}
