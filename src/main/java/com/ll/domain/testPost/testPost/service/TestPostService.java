package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestPostService {
    private final TestPostRepository testPostRepository;
}
