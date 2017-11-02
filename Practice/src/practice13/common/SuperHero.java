package practice13.common;

public class SuperHero extends Hero{

	public SuperHero() {
		super();
	}

	Item equipment;
	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */
	public int attack() {
		int attackdamage;
		attackdamage = super.attack() + this.equipment.additionalDamage;
		return attackdamage;
	}
	public Item getEquipment() {
		return equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}



}
