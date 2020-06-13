package com.chapter.arraysandstrings;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("Before rotating the elements..");
		printMatrix(matrix);
		System.out.println("After rotating the elements..");
		printMatrix(rotate(matrix));

	}
	
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int[][] rotate(int[][] matrix) {
		// check if matrix is square
		if (matrix != null && matrix.length == matrix[0].length) {
			for (int row = 0; row <= matrix.length / 2; row++) {
				for (int col = row + 1; col < matrix[0].length; col++) {
					// swap(matrix[i][j], matrix[j][i]);
					int temp = matrix[row][col];
					matrix[row][col] = matrix[col][row];
					matrix[col][row] = temp;
				}
			}
		} else {
			return new int[][] { { -1, -1 }, { -1, -1 } };
		}
		return matrix;
	}

}