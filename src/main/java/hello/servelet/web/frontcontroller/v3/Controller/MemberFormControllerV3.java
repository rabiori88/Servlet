package hello.servelet.web.frontcontroller.v3.Controller;

import hello.servelet.web.frontcontroller.ModelView;
import hello.servelet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3
{
    @Override
    public ModelView process(Map<String, String> paramMap)  {

        System.out.println("MemberFormControllerV3.process");
        return new ModelView("new-form");
    }
}
