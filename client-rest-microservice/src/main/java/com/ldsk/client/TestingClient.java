package com.ldsk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "testing-client", url = "http://localhost:8081/testing")
public interface TestingClient {

    @GetMapping("/rest")
    public List<String> getTestingList();

}
