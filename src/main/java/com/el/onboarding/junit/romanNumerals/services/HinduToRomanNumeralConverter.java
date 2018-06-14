package com.el.onboarding.junit.romanNumerals.services;

public class HinduToRomanNumeralConverter {
//	1	I
//	4	IV
//	5	V
//	9	IX
//	10	X
//	40	XL
//	50	L
//	90	XC
//	100	C
//	400	CD
//	500	D
//	900	CM
//	1000	M

	public String convert(int n){
		  String value = "";
		  int temp = 0;
		  String numeral = "";
		  int val = 0;
		  do {	
			  if(n >= 1000) {
				  val = 1000;
				  numeral = "M";
			  } else if (n >= 900) {
				  val = 900;
				  numeral = "CM";
			  } else if (n >= 500) {
				  val = 500;
				  numeral = "D";
			  } else if (n >= 400) {
				  val = 400;
				  numeral = "CD";
			  } else if (n >= 100) {
				  val = 100;
				  numeral = "C";
			  } else if (n >= 90) {
				  val = 90;
				  numeral = "XC";
			  } else if (n >= 50) {
				  val = 50;
				  numeral = "L";
			  } else if (n >= 40) {
				  val = 40;
				  numeral = "XL";
			  } else if (n >= 10) {
				  val = 10;
				  numeral = "X";
			  } else if (n >= 9) {
				  val = 9;
				  numeral = "IX";
			  } else if (n >= 5) {
				  val = 5;
				  numeral = "V";
			  } else if (n >= 4) {
				  val = 4;
				  numeral = "IV";
			  } else if (n >= 1) {
				  val = 1;
				  numeral = "I";
			  } else {
				  val = 0;
				  numeral = "";
			  }
			  temp = n / val;
			  value = value + stringAdder(temp, numeral);
			  n = n - (val*temp);
		  }while(n > 0);
		  return value;
	}
	
	public String stringAdder(int n, String l) {
		String value = "";
		for(int i = n; i > 0; i--) {
			value = value + l;
		}
		return value;
	}
	
	
}
