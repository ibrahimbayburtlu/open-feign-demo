package com.ibrahimbayburtlu.MathService.controller;

import com.ibrahimbayburtlu.MathService.DTO.MathDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/{operation}")
    public Double calculateOperation(@PathVariable String operation ,@RequestBody MathDTO mathDTO) {
        if (operation.equalsIgnoreCase("sum")) {
            return mathDTO.getNumberOne() + mathDTO.getNumberTwo();
        } else if (operation.equalsIgnoreCase("extraction")) {
            return Math.abs(mathDTO.getNumberOne() - mathDTO.getNumberTwo());
        } else if (operation.equalsIgnoreCase("multiplication")) {
            return mathDTO.getNumberTwo() * mathDTO.getNumberOne();
        }else if (operation.equalsIgnoreCase("division") && mathDTO.getNumberTwo() != null){
            return mathDTO.getNumberOne() / mathDTO.getNumberTwo();
        }
        return 0.0;
    }

}
