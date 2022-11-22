package hello.core.ch06.discount;

import hello.core.ch06.member.Member;
import hello.core.ch06.member.Grade;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountAmount;
        } else {
            return 0;
        }
    }
}
