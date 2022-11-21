package hello.core.ch03;

import hello.core.ch03.discount.DiscountPolicy;
import hello.core.ch03.discount.RateDiscountPolicy;
import hello.core.ch03.member.MemberRepository;
import hello.core.ch03.member.MemberService;
import hello.core.ch03.member.MemberServiceImpl;
import hello.core.ch03.member.MemoryMemberRepository;
import hello.core.ch03.order.OrderService;
import hello.core.ch03.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "mService")
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean(name = "oService")
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
