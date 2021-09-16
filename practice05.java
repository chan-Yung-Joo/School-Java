public class practice05 {
    public static void main(String[] args) {
        int len1,len2,len3; // 삼각형의 세 변을 저장하기 위한 int형 변수

        for(len1 = 1; len1 < 20; len1++){
            for(len2 = 1; len2 < 20; len2++){
                for(len3 = 1; len3 < 20; len3++){

                    if((len1 + len2 > len3) && (len2 + len3 > len1) && (len3 + len1 > len2)){ // 삼각형의 결정 조건!

                        if((len1 + len2 + len3 <= 20) && (len1*len1 + len2*len2 == len3*len3)){ // 문제에서 주어진 조건
                            System.out.print("가능한 삼각형 변의 길이는 " + len1 + ", " + len2 + ", " + len3);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
