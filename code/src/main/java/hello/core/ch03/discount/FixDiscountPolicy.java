package hello.core.ch03.discount;

import hello.core.ch03.member.Grade;
import hello.core.ch03.member.Member;

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
