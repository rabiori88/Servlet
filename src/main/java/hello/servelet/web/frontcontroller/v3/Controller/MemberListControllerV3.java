package hello.servelet.web.frontcontroller.v3.Controller;

import hello.servelet.domain.member.Member;
import hello.servelet.domain.member.MemberRepository;
import hello.servelet.web.frontcontroller.ModelView;
import hello.servelet.web.frontcontroller.v3.ControllerV3;
import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3
{
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String ,String> paramMap){
        System.out.println("MemberListControllerV3.process");
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;

    }
}
