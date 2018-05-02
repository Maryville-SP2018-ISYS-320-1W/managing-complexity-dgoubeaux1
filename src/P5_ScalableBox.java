

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	public final static double boxWidth = 8 - 2;
	
	public final static double boxHeight = 10 - 2;
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= boxWidth; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= boxHeight; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= boxWidth; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
