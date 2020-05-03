package com.apparelshop.dataretriever.controller.feign;

import com.apparelshop.dataretriever.dto.RequestData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("zuul-api-gateway")
public interface ZuulProxy {

    @PostMapping("data-parsing-adidas-service/process")
    boolean processData(@RequestBody RequestData requestData);

    @GetMapping(path = "adidas-data-scraping/{parser}/{quantity}")
    List<String> collectAndHandOnProductLinks(@PathVariable String parser, @PathVariable int quantity);


}