package hello.core.ch03.discount;

import hello.core.ch03.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
