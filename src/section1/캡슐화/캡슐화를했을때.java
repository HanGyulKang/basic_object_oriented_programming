package section1.캡슐화;

import section1.캡슐화.예제클래스.Account;

public class 캡슐화를했을때 {
    // 기능을 제공하고 구현 상세를 감춤

    public static void main(String[] args) {
        Account acc = new Account();

        if(acc.hasRegularPermission()) {
//            ...정회원 기능
        }
    }
}
