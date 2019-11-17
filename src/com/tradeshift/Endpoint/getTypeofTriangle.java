package com.tradeshift.Endpoint;

import com.tradeshift.service.TriangleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getTypeofTriangle {
    @Inject
    TriangleService triangleService;


    @RequestMapping("/triangle")
    public String getType( String inputJson) {
        return triangleService.getType(inputJson);
    }
}