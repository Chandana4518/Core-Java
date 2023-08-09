package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.SmartWatch;
import com.xworkz.abstraction.implementation.OnePlusSmartWatch;
import com.xworkz.abstraction.user.KlRahul;

public class SmartWatchRunner {

	public static void main(String[] args) {
		
		SmartWatch watch=new OnePlusSmartWatch();
		watch.showTime();
		
		KlRahul smart=new KlRahul(watch);
		smart.wearSmartWatch();

	}

}
