package jp.test;

public class Wizard extends Character {


 String name;
  int hp;


  public String getName(){
	  return this.name;

  }

  public void setName(String name){
	  this.name=name;

  }

  public void song(){
	  System.out.println("魔女は歌った");
  }


  public void heal(Helo h){
	  h.hp+=15;
	  System.out.println(this.name+"が"+h.name+"を回復させた");
	  System.out.println(h.name+"のHPが１５UPした");
  }




}


