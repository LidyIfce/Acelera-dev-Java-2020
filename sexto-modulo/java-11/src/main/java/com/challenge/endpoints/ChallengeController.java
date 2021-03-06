package com.challenge.endpoints;

import com.challenge.entity.Challenge;
import com.challenge.service.impl.ChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/challenge")
@AllArgsConstructor
public class ChallengeController {

    private ChallengeService challengeService;

    @GetMapping
    public List<Challenge> findByAccelerationIdAndUserId(@RequestParam(required = false) Long accelerationId, @RequestParam(required = false) Long userId){
        if(accelerationId != null && userId != null)
            return challengeService.findByAccelerationIdAndUserId(accelerationId, userId);

        return challengeService.findAll();
    }
}
