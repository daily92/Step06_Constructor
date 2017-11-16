package test.main;

import test.school.English;
import test.school.Math;
import test.school.MyGrade;
import test.school.Science;

public class MainClassTest {
	public static void main(String[] args) {
		MyGrade grade1= new MyGrade(new English(), new Math(), new Science());
	
		grade1.eng.abc();
		grade1.math.sum();
		grade1.sci.experiment();
	}
}
