package java_assignments;

public class StudentMarks {

	float subject1,subject2,subject3,subject4;

	StudentMarks(float subject1,float subject2,float subject3,float subject4){

		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;

	}

	StudentMarks(float subject1,float subject2,float subject3){

		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = 35;
	}
	StudentMarks(float subject1,float subject2){

		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = 35;
		this.subject4 = 35;
	}

	public void calculateSumAndAverage() {

		float totalMarks = subject1 + subject2 + subject3 + subject4;
		float averageMarks = totalMarks/4;

		System.out.println("Total Marks:" + totalMarks);
		System.out.println("Average Marks:"+averageMarks);

	}


	public static void main(String[] args) {

		StudentMarks s1 = new StudentMarks(66.56f, 78.89f, 87.56f, 75.99f);
		s1.calculateSumAndAverage();

		StudentMarks s2 = new StudentMarks(88.56f,67.87f,86.77f);
		s2.calculateSumAndAverage();

		StudentMarks s3 = new StudentMarks(58.66f,87.66f);
		s3.calculateSumAndAverage();


	}
}
