package wqf.service.impl;


import wqf.anntation.Service;
import wqf.service.DemoService;

@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService {
    @Override
    public String query(String name, String age) {
        return "name=" + name + "|age=" + age;
    }
}
