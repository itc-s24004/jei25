import java.util.Scanner;

public class D51Q21kadai {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //数値1の入力
        int[] input1 = inputNum();
        int cardinal1 = input1[0], cardinalInt1 = input1[1];
        String value1 = Integer.toString(cardinalInt1, cardinal1);

        System.out.print("演算子を入力");
        String operator = input.nextLine();

        //数値2の入力
        int[] input2 = inputNum();
        int cardinal2 = input2[0], cardinalInt2 = input2[1];
        String value2 = Integer.toString(cardinalInt2, cardinal2);

        //演算子から結果を計算
        int result = switch (operator) {
            case "+" -> cardinalInt1 + cardinalInt2;
            case "-" -> cardinalInt1 - cardinalInt2;
            case "*" -> cardinalInt1 * cardinalInt2;
            case "/" -> cardinalInt1 / cardinalInt2;
            case "%" -> cardinalInt1 % cardinalInt2;
            default -> 0;
        };

        //結果
        System.out.printf("%s(%d進数)(%d) %s %s(%d進数)(%d) = %d", value1, cardinal1, cardinalInt1, operator, value2, cardinal2, cardinalInt2, result);
    }


    public static int[] inputNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("進数を入力: ");
        int cardinal = input.nextInt();
        input.nextLine();
        System.out.print("数値を入力: ");
        String value = input.nextLine();
        int cardinalInt = Integer.parseInt(value, cardinal);

        return new int[] {cardinal, cardinalInt};
    }


}
