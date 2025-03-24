package com.ldsk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "testing-client", url = "${feign.testing.client.url}")
public interface TestingClient {

    @GetMapping("/rest")
    public List<String> getTestingList();

}
