package com.ldsk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/testing")
public class TestingController {

    @GetMapping("/rest")
    public ResponseEntity<List<String>> getTest() {

        int size = 100000;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            list.add(UUID.randomUUID().toString());
        }

        Collections.shuffle(list);

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
