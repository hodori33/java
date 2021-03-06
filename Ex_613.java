package Jungol;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ex_613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String s_name = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Students st1 = new Students(name, s_name, grade);
		System.out.println(st1.printStu());
	}

}

class Students {
	private String name;
	private String s_name;
	private int grade;

	public Students(String name, String s_name, int grade) {
		this.name = name;
		this.s_name = s_name;
		this.grade = grade;
	}

	String printStu() {
		String base = "Name : {0}\nSchool : {1}\nGrade : {2}";
		String resutl = MessageFormat.format(base, this.name, this.s_name, this.grade);
		return resutl;
	}

}
