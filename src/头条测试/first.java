package 头条测试;

public class first {
    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */
    public static void main(String[] args) {

    }
    public int findMoreThanHalfNum(int[] numbers) {
        int length = numbers.length;
        if (length == 0) return 0;

        int num = numbers[0], count = 1;
        for (int i = 1; i < length; i++) {
            if (numbers[i] == num) count++;
            else count--;
            if (count == 0) {
                num = numbers[i];
                count = 1;
            }
        }
        // Verifying
        count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] == num) count++;
        }
        if (count * 2 > length) return num;
        return 0;
    }
}
