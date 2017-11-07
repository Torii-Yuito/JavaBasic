/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		Boolean bo = new Boolean(b);
		System.out.println(bo.booleanValue());

		byte by = 100;
		Byte ob = new Byte(by);
		System.out.println(ob.byteValue());

		short s = 300;
		Short os = new Short(s);
		System.out.println(os.shortValue());

		char c = '日';
		Character ch = new Character(c);
		System.out.println(ch.charValue());

		int i = 1000;
		Integer oi = new Integer(i);
		System.out.println(oi.intValue());

		long l = 2000L;
		Long ol = new Long(l);
		System.out.println(ol.longValue());

		float f = 3.14F;
		Float of = new Float(f);
		System.out.println(of.floatValue());

		double d = 453.592;
		Double od = new Double(d);
		System.out.println(od.doubleValue());

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
	}
}
