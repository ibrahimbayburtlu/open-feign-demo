package com.ibrahimbayburtlu.PresentationService.controller;

import com.ibrahimbayburtlu.PresentationService.DTO.MathDTO;
import com.ibrahimbayburtlu.PresentationService.client.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationController {

    private final MathService mathService;

    @Autowired
    public PresentationController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/math/{operation}")
    public String showResult(@PathVariable String operation, @RequestBody MathDTO mathDTO) {
        Double totalPrice = mathService.calculateOperation(operation,mathDTO);
        return "Result :" + totalPrice;
    }
}