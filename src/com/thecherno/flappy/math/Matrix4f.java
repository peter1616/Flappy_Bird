package com.thecherno.flappy.math;

import static java.lang.Math.*;

public class Matrix4f {
	
	public float[] matrix = new float[4 * 4];
	
	public static Matrix4f identity() {
		Matrix4f result = new Matrix4f();
		
		for (int i = 0; i < 4 * 4; i++) {
			result.matrix[i] = 0.0f;
		}
		result.matrix[0 + 0 * 4] = 1.0f;
		result.matrix[1 + 1 * 4] = 1.0f;
		result.matrix[2 + 2 * 4] = 1.0f;
		result.matrix[3 + 3 * 4] = 1.0f;
		
		return result;
	}

}
