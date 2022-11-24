package hello.core.ch07.discount;

import hello.core.ch07.member.Grade;
import hello.core.ch07.member.Member;

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
