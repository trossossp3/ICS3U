package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Ecoo2010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		int p = in.nextInt();
		int q = in.nextInt();
		
		
		int width = 2 * (p + q) + n;
		int height = 2 * (p + q) + m;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				boolean frame = i < q || j < q || i >= height - q || j >= width - q;
				boolean padding = i < q + p || j < q + p || i >= height - q - p || j >= width - q - p;
				if (frame) {
					System.out.print("#");
				}
				else if (padding) {
					System.out.print("+");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		in.close();
	}

}
