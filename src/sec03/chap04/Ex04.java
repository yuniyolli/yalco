package sec03.chap04;

public class Ex04 {
    public static void main(String[] args) {
        /*
        ### 삼항 연산자

    - a `?` b `:` c
    - a : 불리언 값 (true)
    - b : a가 `true` 일 때 반환될 값
    - c : a가 `false` 일 때 반환할 값
         */
        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝'; // 홀
        // 반환값에 따라 변수의 형 설정
        int num10EInt = num1 % 2 == 1 ? 1 : 2 ;
        char num2OE = num2 % 2 == 1 ? '홀' : '짝'; // 짝



        int num = 3;

        //  아래 값들을 바꿔가며 실행해 볼 것
        boolean mult2 = true;
        //mult2 = false;

        boolean plus5 = true;
        //plus5 = false;

        System.out.println(
                (!mult2 && !plus5) ? num
                        : (mult2 && plus5) ? num * 2 + 5
                        : mult2 ? num * 2
                        : num + 5
        ); // 11



        int x = 1, y = 2;

        //  💡 단축평가 적용됨
        //  x y 값 각각구하는거 아니야. 그냥 하나만 반환되고 끝!!
        int changed1 = x < y ? (x += 2) : (y += 2); // x = 3, y = 2 (changed1 : 3, 나머지 값 필요하지 않음! 사라짐!!! )
        int changed2 = x < y ? (x += 2) : (y += 2); // 🔴 x = 3, y = 4 (changed2 : 4)
        int changed3 = x < y ? (x += 2) : (y += 2); // x = 5, y = 4 (changed3 : 5)
        int changed4 = x < y ? (x += 2) : (y += 2); // x = 5, y = 6 (changed4 : 6) ...
        int changed5 = x < y ? (x += 2) : (y += 2); // x = 7, y = 6
    }
}
