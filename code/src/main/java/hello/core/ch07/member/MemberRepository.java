package hello.core.ch07.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
