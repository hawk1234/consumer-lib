package com.mz.executor;

import com.mz.executor.consumer.BaseConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Component
public class Runner {

    @Autowired
    private List<BaseConsumer> consumers;

    @Scheduled(initialDelay = 2000, fixedDelay = 5000)
    public void runConsumers(){
        consumers.forEach(BaseConsumer::run);
    }
}
