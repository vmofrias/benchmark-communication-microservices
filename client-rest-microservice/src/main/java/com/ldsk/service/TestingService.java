package com.ldsk.service;

import com.ldsk.client.TestingClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestingService {

    private final TestingClient testingClient;

    public List<String> getTestingResultList() {

        return testingClient.getTestingList();
    }

}
