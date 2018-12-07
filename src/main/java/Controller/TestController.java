package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 */
@Controller
public class TestController {

    /**
     *
     *
     * @parameter
     * @return
     *서버에서 url 로 해야 알아먹음.
     *url 주소쪽에다 경로를써버리면 내 로컬에 파일경로라든지, 그냥 그쪽으로 찾아간단 얘기임
     *jsp를 읽음.
     */
    @RequestMapping(value = "/test")
    public String test(){
        return "WEB-INF/views/index.jsp";
    }

    /**
     *
     *
     * @parameter
     * @return
     */
    @RequestMapping(value = "/test2")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/test3")
    public String test3(){ return "test"; }
}