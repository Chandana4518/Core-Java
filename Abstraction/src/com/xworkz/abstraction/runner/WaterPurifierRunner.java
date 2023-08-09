package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WaterPurifier;
import com.xworkz.abstraction.implementation.KentWaterPurifier;
import com.xworkz.abstraction.user.HemaMaliniPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		
		WaterPurifier purify=new KentWaterPurifier();
		purify.filter();
		
		HemaMaliniPurifier hema=new HemaMaliniPurifier(purify);
		hema.Waterfilter();

	}

}
