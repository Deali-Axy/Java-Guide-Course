package lin.Experiment.Exp5.T2.StrEncrypt;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 编写一个加密程序。要求从键盘上输入一字符串(可含数字，大小写字母，以及(空格 , . ?!) )，
 * 以一个密码K(密码取值为 1-99)。加密规则是：对于任何密码，(空格 ,  . ?!)这些符号不加密，
 * 直接原样输出；对于大小写字母，在字母空间内向后循环移动 K位；对于数字，在数字空间中向后循环移动 K位。
 * 比如：
 * 明文18A,Zby
 * 密码K=5
 * 密文是：63F,Egd
 * <p>
 * 明文18A,Zby
 * 密码K=18
 * 密文是：96S,Rtq
 */
public class EncryptProcess {
    private static final char[] excludeList = {' ', ',', '.', '?', '!'};

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String raw = scanner.next();
        System.out.print("Enter password (1-99):");
        int password = scanner.nextInt();
        System.out.println("Result: " + encrypt(raw, password));
    }

    /**
     * 根据加密规则进行加密
     *
     * @param raw      原字符串
     * @param password 密码
     * @return 加密结果
     */
    private static String encrypt(String raw, int password) {
        StringBuilder sb = new StringBuilder();

        for (char c : raw.toCharArray()) {
            if (isNeedEncrypt(c)) {
                CharType type = getCharType(c);
                switch (type) {
                    case number:
                        sb.append(ArrayCircleProc(generateRangeChars('0', '9'), c, password));
                        break;
                    case lower_alpha:
                        sb.append(ArrayCircleProc(generateRangeChars('a', 'z'), c, password));
                        break;
                    case upper_alpha:
                        sb.append(ArrayCircleProc(generateRangeChars('A', 'Z'), c, password));
                        break;
                    case other:
                        // 其他类型的字符，不知道怎么处理，就直接加入结果吧。
                        sb.append(c);
                        break;
                }
            } else
                sb.append(c);
        }

        return sb.toString();
    }


    /**
     * 判断数组中是否存在指定字符
     *
     * @param array     数组
     * @param character 字符
     * @return 有没有，布尔值
     */
    private static boolean isArrayContain(char[] array, char character) {
        for (char c : array) {
            if (c == character)
                return true;
        }
        return false;
    }

    /**
     * 判断这个字符是否需要加密
     *
     * @param character 输入的字符
     * @return 是否要加密
     */
    private static boolean isNeedEncrypt(char character) {
        return !isArrayContain(excludeList, character);
    }

    /**
     * 获取字符的类型
     *
     * @param character 输入的字符
     * @return 类型
     */
    private static CharType getCharType(char character) {

        if (character >= (int) '0' && character <= (int) '9')
            return CharType.number;
        else if (character >= (int) 'a' && character <= (int) 'z')
            return CharType.lower_alpha;
        else if (character >= (int) 'A' & character <= (int) 'Z')
            return CharType.upper_alpha;
        else
            return CharType.other;
    }

    /**
     * 根据给定的字符范围生成数组
     *
     * @param start 开始字符
     * @param end   结束字符
     * @return char数组
     */
    private static char[] generateRangeChars(char start, char end) {
        StringBuilder builder = new StringBuilder();
        for (int i = (int) start; i <= (int) end; i++) {
            builder.append((char) i);
        }
        return builder.toString().toCharArray();
    }

    /**
     * 数组循环处理
     *
     * @param array     指定操作的数组
     * @param character 输入的字符，要存在于数组中才行
     * @param offset    偏移，只支持正数，即在数组中右移
     * @return 返回经过循环偏移后的字符
     */
    private static char ArrayCircleProc(char[] array, char character, int offset) {
        // 如果数组中不存在这个字符，那就只能返回这个字符了
        if (!isArrayContain(array, character))
            return character;
        // 先找到字符在数组中的位置
        int position = Arrays.binarySearch(array, character);

        // 处理offset为无符号数，即绝对值
        offset = Math.abs(offset);            // offset &= 0x0FFFFFFFF;

        // 去除多余的循环
        int newPosition = position + offset;
        if (newPosition >= array.length)
            newPosition -= array.length * (newPosition / array.length);

        return array[newPosition];
    }
}
