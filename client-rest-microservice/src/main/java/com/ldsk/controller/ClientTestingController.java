package com.ldsk.controller;

import com.ldsk.service.TestingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client/testing")
@RequiredArgsConstructor
public class ClientTestingController {

    private final TestingService testingService;

    @GetMapping("/rest")
    public ResponseEntity<List<String>> getTestingResultList() {

        return ResponseEntity.status(HttpStatus.OK).body(testingService.getTestingResultList());
    }

}
