package tw.myproject.oop.array;

public class Test2DimArrayEx2 {

	public static void main(String[] args) {
		int[][] values = { { 1, 2, 3 }, { 4, 5, 6, 10, 7, 8 } };

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.printf("values[%d][%d]=%d\n", i, j, values[i][j]);
			}
		}
	}

}
