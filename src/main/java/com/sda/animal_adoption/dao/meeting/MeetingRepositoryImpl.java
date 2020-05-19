//package com.sda.animal_adoption.dao.meeting;
//
//import com.sda.animal_adoption.model.Meeting;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class MeetingRepositoryImpl implements MeetingInterface {
//
//    private MeetingRepository meetingRepository;
//
//    @Autowired
//    public MeetingRepositoryImpl(MeetingRepository meetingRepository) {
//        this.meetingRepository = meetingRepository;
//    }
//
//    @Override
//    public void save(Meeting meeting) {
//        meetingRepository.save(meeting);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        meetingRepository.delete(findById(id));
//    }
//
//    @Override
//    public void update(Integer id, Meeting meeting) {
//        meetingRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Meeting not found!"))
//                .setDetails(meeting.getDetails());
//    }
//
//    @Override
//    public List<Meeting> findAll() {
//        return meetingRepository.findAll();
//    }
//
//    @Override
//    public Meeting findById(Integer id) {
//        return meetingRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Meeting not found!"));
//    }
//}
