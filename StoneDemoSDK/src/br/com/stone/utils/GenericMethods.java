package br.com.stone.utils;

public class GenericMethods {
	
	public static int getTypeOfParcel(String type){
		int typeParcel = 0; // default is "� VISTA"
		
		switch (type) {
		case "� VISTA":
			typeParcel = 0;
			break;
		case "LOJISTA":
			typeParcel = 1;
			break;
		case "EMISSOR":
			typeParcel = 2;
			break;
		}
		
		return typeParcel;
	}
	
}
