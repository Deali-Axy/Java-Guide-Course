package da.Experiment.Final.Exp2;

public class IntArray {
    private Integer[] array;

    public IntArray() {
    }

    public IntArray(Integer[] a) {
        this.array = a;

    }

    public void initElem(Integer[] a) {
        this.array = a;
    }

    public Integer[] getElem() {
        return this.array;
    }

    public int getMaxElem() {
        int max = 0;
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public int getMinElem() {
        int min = 0;
        for (int i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public int getSumElem() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int getAvgElem() {
        return getSumElem() / array.length;
    }

    public Integer[] getSortedElem() {
        int temp = 0;
        Integer[] sorted = array.clone();
        for (int i = sorted.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (sorted[j] > sorted[j + 1]) {
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
        return sorted;
    }


    public boolean isPrimeOfMaxElem() {
        int max = getMaxElem();
        if (max == 2)
            return true;// 2特殊处理
        if (max < 2 || max % 2 == 0)
            return false;// 识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(max); i += 2) {
            if (max % i == 0) {// 识别被奇数整除
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i : array) {
            builder.append(i);
            builder.append(',');
        }
        return builder.toString();
    }

    public static void main(String args[]) {
        IntArray intArray = new IntArray(new Integer[]{2, 4, 1, 7, 5, 3, 9, 8, 0});
        intArray.initElem(intArray.getSortedElem());
        System.out.println(intArray.toString());
    }
}