package da.Experiment.Exp6.t1;

public class Demo {
	public static void main(String[] args) {
		IntArray array = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 });
		System.out.println("Max Element:" + array.getMaxElem());
		System.out.println("Min Element:" + array.getMinElem());
		System.out.println("Sum:" + array.getSumElem());
		System.out.println("Avg:" + array.getAvgElem());

		System.out.printf("\nisPrimeOfMaxElem? %s\n", array.isPrimeOfMaxElem());
		System.out.printf("is find the element (%d)? %s\n\n", 8, array.isFindElem(8));

		System.out.println("Print Elements:");
		array.printElem();
	}
}
