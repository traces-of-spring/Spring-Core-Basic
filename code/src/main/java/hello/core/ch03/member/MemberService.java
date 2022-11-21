package hello.core.ch03.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
