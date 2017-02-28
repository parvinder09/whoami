package com.whoami.controller;

import com.whoami.model.Whoami;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by parvinder.kumar on 2/28/2017.
 */
@Controller
@RequestMapping("/")
public class WhoamiController {

    Whoami whoami = new Whoami();

    @RequestMapping("/")
    public String show(){
        return "index";
    }

    @RequestMapping("/whoami")
    public @ResponseBody Whoami showData(HttpServletRequest request){
        System.out.print("whoami");
        String osname=System.getProperty("os.name");
        String ip=request.getRemoteAddr();
        String language=request.getHeader("Accept-Language");
        whoami.setOsname(osname);
        whoami.setIp(ip);
        whoami.setLanguage(language);

        return whoami;

    }



}
