package com.tourguide.RewardMicroservice.controllers;

import com.tourguide.RewardMicroservice.services.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardController {

    @Autowired
    RewardService rewardService;

    @GetMapping("/getRewardPoints")
    public int getRewardPoints(@RequestParam UUID attractionId,@RequestParam UUID userId){
        return rewardService.getAttractionRewardPoints(attractionId,userId);
    }

}
