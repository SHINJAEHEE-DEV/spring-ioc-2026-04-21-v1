package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

import java.util.HashMap;

public class ApplicationContext {
    private TestPostRepository testPostRepository;
    private final HashMap<String, Object> beansRegistry = new HashMap<>();

    public ApplicationContext() {

    }

    public <T> T genBean(String beanName) {
        if(beansRegistry.containsKey(beanName)) {
            return (T) beansRegistry.get(beanName);
        }else{
            Object bean = createBean(beanName);
            beansRegistry.put(beanName, bean);
            return (T) bean;
        }
    }
    private Object createBean(String beanName) {
        if(beanName.equals("testPostRepository")) {
            testPostRepository = new TestPostRepository();
            return testPostRepository;
        } else if(beanName.equals("testPostService")) {
            return new TestPostService(testPostRepository);
        }

        throw new RuntimeException("존재하지 않는 빈 이름입니다.");
    }
}
