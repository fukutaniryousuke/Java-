package jp.example;

public class Item {
	String name;
	int price;
	
	public Item(String name) { //引数１つのコンストラクタ
		this(name, 0);
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
