package com.chapter.arraysandstrings;

import com.custom.dataStructures.Tuple2;
import com.util.Util;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] matrix = { { 1, 2, 0, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 0, 14, 15, 16 } };
		System.out.println("Before rotating the elements..");
		Util.printMatrix(matrix);
		System.out.println("After zeroing the elements..");
		Util.printMatrix(makeZeroMatrix(matrix));
	}
	
	static Integer[][] makeZeroMatrix(Integer[][] matrix){
		// check if null 
		if(matrix == null){
			return new Integer[][]{{-1,-1},{-1,-1}};
		}
		if(matrix.length==0){
			return new Integer[][]{{-1,-1},{-1,-1}};
		}
		Tuple2<Integer[], Integer[]> listRowColZeroes = findZeroRowCols(matrix);
		matrix = makeRowsZero(matrix, listRowColZeroes.getValue1());
		matrix = makeColsZero(matrix, listRowColZeroes.getValue2());
		return matrix;
	}
	
	static Tuple2<Integer[], Integer[]> findZeroRowCols(Integer[][] matrix){
		Integer[] rows = new Integer[matrix.length];
		Integer[] cols = new Integer[matrix[0].length];
		int rowCount = 0;
		int colCount = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					if(!Util.arrHasValue(rows, i)){
						rows[rowCount++] = i;
					}
					if(!Util.arrHasValue(cols, j)){
						cols[colCount++] = j;
					}
				}
			}
		}
		return new Tuple2<Integer[], Integer[]>(rows, cols);
	}
	
	static Integer[][] makeRowsZero(Integer[][] matrix, Integer[] rows){
		for(int i=0; i<rows.length; i++){
			if(rows[i]!=null){
			 for(int j=0; j<matrix[0].length; j++){
				 matrix[rows[i]][j] = 0;
			 }
			}
		}
		return matrix;
	}
	
	static Integer[][] makeColsZero(Integer[][] matrix, Integer[] cols){
		for(int i=0; i<cols.length; i++){
			if(cols[i]!=null){
			 for(int j=0; j<matrix.length; j++){
				 matrix[j][cols[i]] = 0;
			 }
			}
		}
		return matrix;
	}

}
