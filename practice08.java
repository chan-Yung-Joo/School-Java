import java.util.Scanner;

public class practice08 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int input_number; // 입력 받을 int 변수
        int pos100, pos10, pos1; // 자릿수를 위한 int 변수
        int sum; // 자릿수의 합을 위한 int 변수

        System.out.print("0~999 사이의 숫자를 입력하세요 >>> ");
        input_number = scanner.nextInt();

        if(input_number<0 || input_number>999){
            System.out.println("범위 외의 숫자를 입력하셨습니다.");
        }
        else {
            pos100 = input_number / 100;
            pos10 = input_number / 10;
            pos10 = pos10 % 10;
            pos1 = input_number % 10;

            sum = pos100 + pos10 + pos1;

            System.out.println("각 자릿수의 합은 >>> " + sum);
        }
        scanner.close();
    }
}
