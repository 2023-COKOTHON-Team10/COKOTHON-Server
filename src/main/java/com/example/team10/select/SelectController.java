package com.example.team10.select;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SelectController {
    private final SelectService selectService;

    @GetMapping("/api/selectAll")
    public SelectResponse getAllData(@RequestBody SelectRequest request){
        return selectService.selectAllDataByUser(request);
    }
}
