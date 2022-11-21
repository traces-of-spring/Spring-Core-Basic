package hello.core.ch03.discount;

import hello.core.ch03.member.Grade;
import hello.core.ch03.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountRate = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountRate / 100;
        } else {
            return 0;
        }
    }
}
