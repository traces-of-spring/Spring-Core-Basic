package hello.core.ch06.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
