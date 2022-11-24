package hello.core.ch07.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
