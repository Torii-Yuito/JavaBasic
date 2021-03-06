package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "Red";
		car1.gasoline = 50;

		car2.color = "Blue";
		car2.gasoline = 60;

		car3.color = "Yellow";
		car3.gasoline = 70;

		final int distance = 300;

		Car[] cars = {car1, car2, car3};

		for (Car car : cars) {
			int sum = 0;
			int count = 0;

			while(true) {
				int dis = car.run();
				sum += dis;
				count++;

				if(dis == -1){
					System.out.println("目的地に到達できませんでした");
					break;
				}

				if(sum >= distance){
					System.out.println("目的地まで" + count + "時間かかりました。" +
									"残りのガソリンは" + car.gasoline + "リットルです");
					break;
				}

			}
		}



//		int sum = 0;
//		int count = 0;
//
//		while(true) {
//			int dis = car1.run();
//			sum += dis;
//			count++;
//
//			if(dis == -1){
//				System.out.println("目的地に到達できませんでした");
//				break;
//			}
//
//			if(sum >= distance){
//				System.out.println("目的地まで" + count + "時間かかりました。" +
//								"残りのガソリンは" + car1.gasoline + "リットルです");
//				break;
//			}
//
//		}
//
//		sum = 0;
//		count = 0;
//		while(true) {
//			int dis = car2.run();
//			sum += dis;
//			count++;
//
//			if(dis == -1){
//				System.out.println("目的地に到達できませんでした");
//				break;
//			}
//
//			if(sum >= distance){
//				System.out.println("目的地まで" + count + "時間かかりました。" +
//									"残りのガソリンは" + car2.gasoline + "リットルです");
//				break;
//			}
//
//		}
//
//		sum = 0;
//		count = 0;
//		while(true) {
//			int dis = car3.run();
//			sum += dis;
//			count++;
//
//			if(dis == -1){
//				System.out.println("目的地に到達できませんでした");
//				break;
//				}
//
//			if(sum >= distance){
//				System.out.println("目的地まで" + count + "時間かかりました。" +
//									"残りのガソリンは" + car3.gasoline + "リットルです");
//				break;
//			}
//
//		}
	}
}
