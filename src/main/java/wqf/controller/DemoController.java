package wqf.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wqf.anntation.Autowired;
import wqf.anntation.Controller;
import wqf.anntation.RequestMapping;
import wqf.anntation.RequestParam;
import wqf.service.DemoService;

@Controller("wqf")
@RequestMapping("/demo")
public class DemoController {

    @Autowired("demoServiceImpl")
    private DemoService demoService;

    @RequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse res, @RequestParam("n") String name, @RequestParam("a") String age) {
        try {
            String result = demoService.query(name, age);
            PrintWriter pw = res.getWriter();
            pw.write(result);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
