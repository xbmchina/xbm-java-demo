package cn.xbmchina.multirabbitdemo;

import com.sun.deploy.net.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
@RestController
public class MultiRabbitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiRabbitDemoApplication.class, args);
    }


    @RequestMapping("/")
    public void test(HttpServletResponse repose) throws IOException {

        repose.setContentType("text/html;charset=utf-8");
        PrintWriter out = repose.getWriter();
        out.write("<img src='http://b-ssl.duitang.com/uploads/item/201809/22/20180922230455_VZhYu.thumb.700_0.jpeg' />");
        out.close();
    }

}
