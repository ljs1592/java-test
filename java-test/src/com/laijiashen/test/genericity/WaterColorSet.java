package com.laijiashen.test.genericity;

import java.util.EnumSet;
import java.util.Set;
import static com.laijiashen.test.genericity.WaterColor.*;

public class WaterColorSet {
	
	public static void main(String[] args) {
		Set<WaterColor> set1 = EnumSet.range(WHITE, RED);
		System.out.println(set1);
	}

}
