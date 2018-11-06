package lin.Experiment.Exp6.T1;

/**
 * 1、有一个shape接口，利用该接口来编写圆柱体，圆锥，长方体，
 * 和正方体的表面积与体积的应用程序（其中正方体是长方体的子类，圆锥是圆柱的子类），
 * 要求接口回调技术来求这些几何图形的体积和表面积。
 */
public class Test {
    public void area(Shape shape) {
        System.out.println("面积：" + shape.area());
    }

    public void volume(Shape shape) {
        System.out.println("体积：" + shape.volume());
    }

    public static void main(String... args) {
        Cylinder cylinder = new Cylinder(21, 10);
        Cuboid cuboid = new Cuboid(10, 20, 30);
        Cone cone = new Cone(20, 41);
        Cube cube = new Cube(100);

        new Test().area(cylinder);
        new Test().volume(cylinder);
        new Test().area(cuboid);
        new Test().volume(cuboid);
        new Test().area(cone);
        new Test().volume(cone);
        new Test().area(cube);
        new Test().volume(cube);
    }
}
