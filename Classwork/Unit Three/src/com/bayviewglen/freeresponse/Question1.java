package com.bayviewglen.freeresponse;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("--------------------------");
		System.out.println("Question One:");
		System.out.println("--------------------------");
		questionOne();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Question Two:");
		System.out.println("--------------------------");
		questionTwo();
	}

	public static void questionTwoWork(int[][] x) {
		display(x);
		System.out.println("is" + (!isLatinSquare(x) ? " NOT" : "") + " a Latin Square");
		System.out.println();
	}

	private static void questionTwo() {
		int[][] x = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		questionTwoWork(x);

		x = new int[][] { { 1, 2, 1 }, { 2, 2, 1 }, { 1, 1, 2 } };
		questionTwoWork(x);

		x = new int[][] { { 1, 2, 3 }, { 3, 1, 2 }, { 7, 8, 9 } };
		questionTwoWork(x);

		x = new int[][] { { 1, 2 }, { 1, 2 } };
		questionTwoWork(x);

		x = new int[][] { { 10, 30, 20, 0 }, { 0, 20, 30, 10 }, { 30, 0, 10, 20 }, { 20, 10, 0, 30 } };
		questionTwoWork(x);
	}

	public static boolean isLatinSquare(int[][] x) {
		if (!containsDuplicates(x[0])) {
			for (int i = 0; i < x.length; i++) {
				if (!hasAllValues(x[0], x[i])) {
					return false;
				}
				if (!hasAllValues(x[0], getColumn(x, i))) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	private static void populate(int[][] arr2D) {
		int x = 0;
		// traverse using row-major order
		// one row at a time
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				arr2D[i][j] = x;
				x++;
			}
		}

	}

	public static boolean containsDuplicates(int[] row) {
		int[] r = Arrays.copyOf(row, row.length);
		Arrays.sort(r);
		for (int i = 0; i < r.length - 1; i++) {
			if (r[i] == r[i + 1])
				return true;
		}
		return false;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		int[] a1 = Arrays.copyOf(arr1, arr1.length);
		int[] a2 = Arrays.copyOf(arr2, arr2.length);
		Arrays.sort(a1);
		Arrays.sort(a2);
		for (int i = 0; i < a1.length; i++) {
			if (!(a1[i] == a2[i])) {
				return false;
			}
		}
		return true;
	}

	private static void display(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.printf("%4d", arr2d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void questionOne() {
		int[][] arr2D = new int[4][6];
		populate(arr2D);
		display(arr2D);

		int[] result = getColumn(arr2D, 1);
		display(result);

	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] result = new int[arr2D.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = arr2D[i][c];
		}
		return result;
	}

}
