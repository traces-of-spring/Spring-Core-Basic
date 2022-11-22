package hello.core.ch06.discount;

import hello.core.ch06.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
