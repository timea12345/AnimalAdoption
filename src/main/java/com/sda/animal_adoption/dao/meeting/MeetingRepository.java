package com.sda.animal_adoption.dao.meeting;

import com.sda.animal_adoption.model.Meeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MeetingRepository extends CrudRepository<Meeting, Integer> {

    List<Meeting> findAll();
    Optional<Meeting> findById(Integer id);

}
