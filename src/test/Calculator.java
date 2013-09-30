package test;

public class Calculator {
	public int add(int x , int y){
		return x + y;
	}
	public int substraction(int x, int y){
		return x -y;
	}
	
	public long multiply(int x, int y) {
		return x * y;
	}
	
	public float devide(int x, int y) {
		if (x == 0 || y == 0) {
			throw new IllegalArgumentException(); 
		}
		return x/y;
	}

}
