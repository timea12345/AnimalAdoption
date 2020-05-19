package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.meeting.MeetingRepository;
import com.sda.animal_adoption.model.Contract;
import com.sda.animal_adoption.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {

    private MeetingRepository meetingRepository;

    @Autowired
    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public void save(Meeting meeting) {
        meetingRepository.save(meeting);
    }

    public void delete(Integer id) { meetingRepository.delete(findById(id));
    }

    public Meeting findById(Integer id) {
        return meetingRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Meeting not found!"));
    }

    public List<Meeting> findAll() {
        return meetingRepository.findAll();
    }

}
