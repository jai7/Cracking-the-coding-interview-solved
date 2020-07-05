package com.chapter.arraysandstrings;

import com.util.Util;

public class RotateMatrix {

	public static void main(String[] args) {
		Integer[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("Before rotating the elements..");
		Util.printMatrix(matrix);
		System.out.println("After rotating the elements..");
		Util.printMatrix(rotate(matrix));

	}
	
	static Integer[][] rotate(Integer[][] matrix) {
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
			return new Integer[][] { { -1, -1 }, { -1, -1 } };
		}
		return matrix;
	}

}