package hello.core.ch07.discount;

import hello.core.ch07.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
