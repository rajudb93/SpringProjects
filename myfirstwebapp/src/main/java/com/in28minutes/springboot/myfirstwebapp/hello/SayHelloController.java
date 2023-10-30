package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SayHelloController {

    //Say-Hello=>"Hello!what are you learning today?"
    @RequestMapping("/say-hello")
    public String sayhello() {
        return "Hello! what are you learning today?";
    }

    @RequestMapping("say-hello-html")
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }


}
