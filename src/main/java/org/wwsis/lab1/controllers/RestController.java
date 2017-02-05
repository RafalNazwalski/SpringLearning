package org.wwsis.lab1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wwsis.lab1.model.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rafalnazwalski on 05.02.2017.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private List<String> dataList = new ArrayList<String>(Arrays.asList("Spring", "Rest", "SRC"));

    @RequestMapping("/rest")
    public Data getData(@RequestParam(value = "id", defaultValue = "0") Integer id){
        return new Data(id, dataList.get(id));
    }

}
