package cn.org.xinke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cxq on 2018-3-15.
 */
@Controller
public class TestController {

    @RequestMapping("say")
    public String say (ModelMap modelMap) {
        modelMap.put( "hello", "Hello gjhghjghjghj" );
        return "say";
    }
}
