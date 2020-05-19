package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController (MeetingService meetingService) {
        this.meetingService = meetingService;
    }
}
