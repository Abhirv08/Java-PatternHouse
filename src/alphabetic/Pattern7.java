/**
 * Copyright(C) 2021, PatternHouse and its developers
 * Licensed under MIT License
 **/

public class Pattern7 {
	
	public static void main(String[] args) {
		char[] validChars = new char[]{ 'A', 'B', 'C', 'D', 'E' };
		for(int i=0;i<validChars.length;i++)  {
			for(int j=validChars.length-i;j>0;j--)
				System.out.print(validChars[i]);
			System.out.println();
		}
	}

}