package hello.core.ch03;

import hello.core.ch03.discount.FixDiscountPolicy;
import hello.core.ch03.discount.RateDiscountPolicy;
import hello.core.ch03.member.MemberService;
import hello.core.ch03.member.MemberServiceImpl;
import hello.core.ch03.member.MemoryMemberRepository;
import hello.core.ch03.order.OrderService;
import hello.core.ch03.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
