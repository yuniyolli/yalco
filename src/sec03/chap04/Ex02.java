package sec03.chap04;

public class Ex02 {
    public static void main(String[] args) {
    boolean bool1 = true && true; // true
    boolean bool2 = true && false; // false
    boolean bool3 = false & true; // false
    boolean bool4 = false && false; // false

    boolean bool5 = true || true; // true
    boolean bool6 = true || false; // true
    boolean bool7 = false || true; // true
    boolean bool8 = false || false; // false



    int num = 4;
// is로 시작해서 이다아니다 알려주는 변수 많음
    boolean isPositiveAndOdd = num >= 0 && num % 2 == 1; // true 땡 false 나머지 없자낭!!!
    boolean isPositiveOrOdd = num >= 0 || num % 2 == 1; // true

    boolean isPositiveAndEven = num >= 0 && num % 2 == 0; // false 땡 true 나머지 없자낭!!!
    boolean isPositiveOrEven = num >= 0 || num % 2 == 0; // true



    num = 6;

    //  💡 &&가 ||보다 우선순위 높음
    boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10); // true
    boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10); // false
    }
}
