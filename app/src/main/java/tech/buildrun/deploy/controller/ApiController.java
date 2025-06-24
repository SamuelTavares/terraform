package tech.buildrun.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity<TimestampRsponse> helloAws(){
        return ResponseEntity.ok(new TimestampRsponse(Instant.now()));
    }
}
