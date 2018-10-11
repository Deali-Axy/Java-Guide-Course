package da.Experiment.Exp6.t1;

public class IntArray {
	private int[] array;

	public IntArray() {
		initElem(new int[] { 11, 2, 3, 14, 31, 16, 47, 18, 45, 79, 30, 10, 35, 21 });
	}

	public IntArray(int[] a) {
		initElem(a);
	}

	public void initElem(int[] a) {
		this.array = a;
	}

	public int[] getElem() {
		return this.array;
	}

	public int getMaxElem() {
		int max = 0;
		for (int a : array) {
			if (a > max)
				max = a;
		}
		return max;
	}

	public int getMinElem() {
		int min = 0;
		for (int a : array) {
			if (a < min)
				min = a;
		}
		return min;
	}

	public int getSumElem() {
		int count = 0;
		for (int a : array) {
			count += a;
		}
		return count;
	}

	public int getAvgElem() {
		return getSumElem() / array.length;
	}

	public int[] getSortedElem() {
		int[] sorted = array;
		int temp = 0;
		for (int i = 0; i <= sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - 1 - i; j++) {
				if (sorted[j] > sorted[j + 1]) {
					temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
		}
		return sorted;
	}

	public boolean isPrimeOfMaxElem() {
		int max = getMaxElem();
		if (max < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(max); i++) {
			if (max % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isFindElem(int x) {
		for (int i : array) {
			if (i == x)
				return true;
		}
		return false;
	}

	public void printElem() {
		int counts = array.length / 5;
		int a = 0;
		String line = "";
		for (a = 0; a < counts; a++) {
			for (int i = a * 5; i < (a + 1) * 5; i++) {
				// sBuilder.append(array[i]);
				line += array[i] + ",";
			}
			System.out.println(line);
			line = "";
		}
		for (int i = a * 5; i < array.length; i++) {
			line += array[i] + ",";
		}
		System.out.println(line);
	}
}
