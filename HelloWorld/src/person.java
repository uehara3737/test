/**
 *
 */

/**
 * @author internousdev
 *
 */
public class person {



public String name;
public int hp;
Sword ken;

person(){
	this.hp=100;

}


//ゲッター
	public String getName(){
	return this.name;

}

//セッター
	public void setName(String x){
	this.name=x;

}


void sleep(){
this.hp=100;
System.out.println(this.name+"は眠って回復した");
}

void sit(int suwatta){
	this.hp+=suwatta;
	System.out.println(this.name+"は、"+suwatta+"秒坐った");
System.out.println("ＨＰが"+suwatta+"ポイント回復した");

}



void slip(){
	this.hp-=5;
	System.out.println(this.name+"は、転んだ");
	System.out.println("5のダメージ");
}



void run(){
	System.out.println(this.name+"は逃げ出した");
	System.out.println("hpは"+this.hp+"でした");
}
}








