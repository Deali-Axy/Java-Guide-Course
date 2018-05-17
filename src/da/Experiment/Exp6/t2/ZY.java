package da.Experiment.Exp6.t2;

public class ZY {
    public static void main(String[] args) {
        Student[] liStudents = new Student[5];

        for (int i = 0; i < 5; i++) {
            liStudents[i] = new Student(i, "stu" + i, 3);
        }

        for (Student s : liStudents) {
            if (s.getGrade() == 3) {
                System.out.printf("name=%s, id=%d\n", s.getName(), s.getId());
            }
        }
    }
}
