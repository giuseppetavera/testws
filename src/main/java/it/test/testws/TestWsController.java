package it.test.testws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class TestWsController {

    @PostMapping(value = "/access", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void insertLog(@RequestBody @Valid AccessLogDTO body){
        if (body!=null) {
            System.out.println(body.getUsername());
        }
    }
}
