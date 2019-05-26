package math;

public class Matrix3 {

	public float[][] matrix;
	
	public Matrix3() {
		matrix = new float[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	public void add(Matrix3 mat) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = mat.matrix[i][j];
			}
		}
	}
	
}
