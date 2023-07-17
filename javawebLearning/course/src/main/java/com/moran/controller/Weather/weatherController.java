package com.moran.controller.Weather;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class weatherController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/weather")
    public String weather(){
        String apiURL ="http://aider.meizu.com/app/weather/listWeather?cityIds=101210101";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(apiURL, String.class);
        if (200 == forEntity.getStatusCodeValue()){
            return forEntity.getBody();
        }else{
            return "error with code:"+forEntity.getStatusCodeValue();
        }
    }

}

