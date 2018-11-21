package lin.Experiment.Exp8;

public class Student {
    public String name = "";
    public int math;
    public int physics;
    public int english;

    public Student() {
    }

    public Student(String name, int math, int physics, int english) {
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.english = english;
    }

    public int sum() {
        return math + physics + english;
    }
}
