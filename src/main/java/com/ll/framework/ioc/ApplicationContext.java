package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    private TestPostRepository testPostRepository;
    public ApplicationContext() {

    }

    public <T> T genBean(String beanName) {
        //싱글톤 유지가 되야함
        return (T) new TestPostService(testPostRepository);
    }
}
