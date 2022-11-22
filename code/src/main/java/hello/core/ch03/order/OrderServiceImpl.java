package hello.core.ch03.order;

import hello.core.ch03.discount.DiscountPolicy;
import hello.core.ch03.discount.FixDiscountPolicy;
import hello.core.ch03.member.Member;
import hello.core.ch03.member.MemberRepository;
import hello.core.ch03.member.MemberService;
import hello.core.ch03.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
