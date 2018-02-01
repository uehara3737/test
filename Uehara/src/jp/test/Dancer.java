package jp.test;

public class Dancer extends Character {


	public void attack(Kinoko k){
		System.out.println(this.name+"がキノコを攻撃した！");
	k.hp-=20;
	System.out.println("キノコのｈｐは"+k.hp+"です");

	}




}
