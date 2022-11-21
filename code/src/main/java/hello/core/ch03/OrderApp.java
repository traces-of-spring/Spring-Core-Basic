package hello.core.ch03;

import hello.core.ch03.member.Grade;
import hello.core.ch03.member.Member;
import hello.core.ch03.member.MemberService;
import hello.core.ch03.order.Order;
import hello.core.ch03.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId,  "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("order = " + order);
    }
}
