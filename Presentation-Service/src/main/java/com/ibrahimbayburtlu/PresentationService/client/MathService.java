package com.ibrahimbayburtlu.PresentationService.client;

import com.ibrahimbayburtlu.PresentationService.DTO.MathDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "math-service")
public interface MathService {

    @GetMapping("/math/{operation}")
    Double calculateOperation(@PathVariable String operation, @RequestBody MathDTO mathDTO);
}