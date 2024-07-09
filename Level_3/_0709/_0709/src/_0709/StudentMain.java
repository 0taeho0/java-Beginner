package _0709;

public class StudentMain {

	public static void main(String[] args) {
		
		
//		Student st1 = new Student(21110,"sw개발과","박한결");
//		Student1 st2 = new Student1(11111, "sw개발과", "권세준");
//		Student2 st3 = new Student2(22222,"박한결","sw개발과");
//		Student3 st4 = new Student3(30900, "스마트과", "양민석");
		Student[] 학생들 = {
				new Student1(11111, "sw개발과", "권세준"),
				new Student2(22222,"sw개발과","박한결"),
				new Student3(30900, "스마트과", "양민석")
				};
		for(Student i : 학생들) {
			i.자기소개();
		}
	}

}
