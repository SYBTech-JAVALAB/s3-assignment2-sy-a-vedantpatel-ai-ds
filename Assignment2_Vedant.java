import java.util.Scanner;


class Student{
	static String course_name = "Artificial Intelligence and Data Science";
	String name;
	int id;
	double marks;
	char grade;
	static int StudentCount = 0;
	
	Student(){
		this.name = "";
		this.id = 123;
		this.marks = 1.23;
		this.grade = 'A';
		StudentCount++;
	}
	
	Student(String name, int id, double marks){
		this.name = name;
		this.id = id;
		this.marks = marks;
		StudentCount++;
	}
	
	void Calculate_Grade(double marks){
		if(marks >= 90.0) {
			System.out.println("Grade: A");
		}
		else if(marks >= 80.0 && marks < 90.0) {
			System.out.println("Grade: B");
		}
		else if(marks >= 70.0 && marks < 80.0) {
			System.out.println("Grade: C");
		}
		else if(marks >= 60.0 && marks < 70.0) {
			System.out.println("Grade: D");
		}
		else if(marks >= 50.0 && marks < 60.0) {
			System.out.println("Grade: E");
		}
		else if(marks >= 40.0 && marks < 50.0) {
			System.out.println("Grade: P");
		}
		else {
			System.out.println("Grade: F");
		}
	}
	
	void display_details() {
		System.out.println("Student Details.");
		System.out.println("Course Name: " + course_name);
		System.out.println("Student Name: " + name);
		System.out.println("Student id: " + id);
		System.out.println("Marks: " + marks);
		
		Calculate_Grade(marks);
		
	}
	
	static int TotalStudents() {
		return StudentCount++;
	}
}


public class Assignment2_Vedant {
	public static void main(String[] argc) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("Enter the number of Students: ");
		int n = scn.nextInt();
		
		Student[] students = new Student[n];
		
		int i = 0;
		while(i <= n-1) {
			System.out.println("Enter details for Student." + (i+1));
			System.out.print("Enter Student Name: ");
			String name = scn.nextLine();
			scn.nextLine();
				
			System.out.print("Enter Student ID: ");
			int id = scn.nextInt();
				
			System.out.print("Enter Marks: ");
			double marks = scn.nextDouble();
		
			students[i] = new Student(name, id, marks);	
			
			i++;
		}
	
		for(int j = 0; j < n ; j++) {
			students[j].display_details();
		}
		
		System.out.println("Total Number of Student: " + Student.StudentCount);
		
		scn.close();
	}
}
