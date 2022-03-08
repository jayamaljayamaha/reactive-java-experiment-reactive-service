package org.example.customjavareactapp.contoller;

import org.example.customjavareactapp.modal.Data;
import org.example.customjavareactapp.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetController {

    @Autowired
    private CustomService customService;

    @GetMapping(value = "/data")
    public Mono<Data> getData(){
        return customService.getData(Thread.currentThread().getId(), System.currentTimeMillis());
    }
}
