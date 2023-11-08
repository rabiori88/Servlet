package hello.servelet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void getInstance() {
    }

    @Test
    void save() {
        //given
        Member member = new Member("Hello", 120);

        //when
        Member SavedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(SavedMember.getId());
        assertThat(findMember).isEqualTo(SavedMember);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        //given
        Member memeber1 = new Member("memeber1 ", 20);
        Member memeber2 = new Member("memeber2 ", 30);

        memberRepository.save(memeber1);
        memberRepository.save(memeber2);


        //when
        List<Member> result = memberRepository.findAll();


        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(memeber1, memeber2);


    }

    @Test
    void clearStore() {
    }
}