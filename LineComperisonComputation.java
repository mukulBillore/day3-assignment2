package blz;
import java.util.Random;
public class LineComperisonComputation {
public static double lineCreation(){
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
	return lengthOFline1;
}

public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Welcome to program to calculate the line comparision and computation video");
		double line1=LineComperisonComputation.lineCreation();
		double line2=LineComperisonComputation.lineCreation();
		System.out.println("The length of line 1 is : "+line1+" & length of line 2 is : "+line2);
	//@use case 2 compare using equals method 	
		Double linea = line1,lineb=line2;
		boolean b = linea.equals(lineb);
		if(b)System.out.print("both the lines are equal ");
		else System.out.print("both the lines are not  equal ");
    //@use case 3 compare using compareTo method
		int comparsionResult=linea.compareTo(lineb);
		if(b)System.out.print("both the lines are equal ");
		else System.out.print("both the lines are not  equal ");
}

}
