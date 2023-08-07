package com.xworkz.Train;

public class TrainRunner {

	public static void main(String[] args) {
		
		ChennaiExpress ce=new ChennaiExpress();
		ce.heavyThingCarry();
		ce.storage();
		ce.travel();
		ce.heavyThingCarry();
		
		GoodsTrain gt=new ChennaiExpress();
		gt.stop();
		gt.storage();
		gt.travel();
		
		ExpressTrain et=new ChennaiExpress();
		et.travel();
		et.storage();
		et.heavyThingCarry();
		
		Train train=new ChennaiExpress();
		train.storage();
		train.travel();
	}

}
