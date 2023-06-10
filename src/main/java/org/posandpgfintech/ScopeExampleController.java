package org.posandpgfintech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ScopeExampleController {

    @Autowired
    private SingletonService singletonService;
    @GetMapping("/v1/getDates")
    public List<String> getDates() throws InterruptedException{
        String string1=singletonService.getMethod();
        Thread.sleep(2000);
        String string2=singletonService.getMethod();
        return Arrays.asList(string1,string2);
    }

}
