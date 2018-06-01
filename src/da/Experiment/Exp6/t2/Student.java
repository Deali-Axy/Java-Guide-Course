package da.Experiment.Exp6.t2;

public class Student {
	private String name = "";
	private int id;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int i, String n, int g) {
		id = i;
		name = n;
		grade = g;
	}
}
