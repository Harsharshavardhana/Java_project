package hellow;
import java.util.Scanner;

public class GetStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		String name;
        String roll;
        int maths, physic , english ,kannada;  
        try (Scanner SC = new Scanner(System.in)) {
			System.out.print("Enter Name: ");
			name=SC.nextLine();
			System.out.print("Enter Roll Number: ");
			roll=SC.nextLine();
			System.out.print("Enter marks in Maths, Physics and English,kannada: ");
			maths=SC.nextInt();
			physic=SC.nextInt();
			english=SC.nextInt();
			kannada=SC.nextInt();
		}
         
        int total=maths+physic+english+kannada;
        float perc=(float)total/400*100;
         
        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks (Maths, Physics, English, Kannada): " +maths+","+english+","+english+","+kannada);
        System.out.println("Total: "+total +"\tPercentage: "+perc);
	}

}
