package hello.core.ch07;

import hello.core.ch07.member.Grade;
import hello.core.ch07.member.Member;
import hello.core.ch07.member.MemberService;
import hello.core.ch07.order.Order;
import hello.core.ch07.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("mService", MemberService.class);
        OrderService orderService = applicationContext.getBean("oService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId,  "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("order = " + order);
    }
}
