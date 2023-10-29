package sec03.chap04;

public class Ex03 {
    public static void main(String[] args) {
        /*
        ### 단축평가 *short circuit*
- `&&`: 앞의 것이`false`면 뒤의 것을 평가할 필요 없음
- `||`: 앞의 것이`true`면 뒤의 것을 평가할 필요 없음
- **평가는 곧 실행**- 이 점을 이용한 간결한 코드
- 💡**연산 부하가 적은 코드를 앞에**- 리소스 절약
         */
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3); // true && c, d added
        boolean bool2 = a < b || e++ < (f += 3); // true && not added

        boolean bool3 = a > b && c++ < (d += 3); // false 🔴 not added
        boolean bool4 = a > b || e++ < (f += 3); // true added



    }
}
