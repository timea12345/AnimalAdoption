package com.sda.animal_adoption.dao.meeting;

import com.sda.animal_adoption.model.Meeting;
import java.util.List;

public interface MeetingInterface {

    void save(Meeting meeting);
    void delete(Integer id);
    void update(Integer id, Meeting meeting);
    List<Meeting> findAll();
    Meeting findById(Integer id);

}
