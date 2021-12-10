package blz;
import java.util.Random;
public class LineComperisonComputation {
	
public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Welcome to program to calculate the line comparision and computation video");
		double x1=rand.nextInt(20);
		double y1=rand.nextInt(20);
		double x2=rand.nextInt(20);
		double y2=rand.nextInt(20);
		double p1 =x2-x1;
		double p2=y2-y1;
		double addOFSquare=  (Math.pow(p1,2)+Math.pow(p2, 2));
		double lengthOFline1= Math.sqrt(addOFSquare);
		//uc1
		System.out.println("The length of line is "+lengthOFline1);
	}

}
