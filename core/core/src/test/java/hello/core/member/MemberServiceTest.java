package hello.core.member;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    
    MemberService memberService = new MemberServiceImpl();
    
    @Test
    void join() {
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
