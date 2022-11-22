package hello.core.ch06;

import hello.core.ch06.discount.DiscountPolicy;
import hello.core.ch06.discount.RateDiscountPolicy;
import hello.core.ch06.member.MemberRepository;
import hello.core.ch06.member.MemberService;
import hello.core.ch06.member.MemberServiceImpl;
import hello.core.ch06.member.MemoryMemberRepository;
import hello.core.ch06.order.OrderService;
import hello.core.ch06.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "mService")
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean(name = "oService")
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
