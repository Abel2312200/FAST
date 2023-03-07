package com.example.fast.projet.repositories;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fast.projet.entities.Queue;

@SpringBootTest
public class QueueRepositoryTest {

    @Autowired
    private QueueRepository queueRepository;

    @Test
    public void saveQueue() {
        Queue queue = Queue.builder()
                        .queueCode("NSAI-YOP1Q03")
                        .queueSize(23)
                        .dateCreated(new Date())
                        .build();
        
        queueRepository.save(queue);
    }
}
