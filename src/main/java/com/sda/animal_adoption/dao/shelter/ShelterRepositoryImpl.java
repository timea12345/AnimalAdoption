//package com.sda.animal_adoption.dao.shelter;
//
//import com.sda.animal_adoption.model.Shelter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class ShelterRepositoryImpl implements ShelterInterface{
//
//    private ShelterRepository shelterRepository;
//
//    @Autowired
//    public ShelterRepositoryImpl(ShelterRepository shelterRepository) {
//        this.shelterRepository = shelterRepository;
//    }
//
//    @Override
//    public void save(Shelter shelter) {
//        shelterRepository.save(shelter);
//    }
//
//    @Override
//    public Shelter findById(Integer id) {
//        return shelterRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Shelter not found!"));
//    }
//
//    @Override
//    public List<Shelter> findAll() {
//        return shelterRepository.findAll();
//    }
//
//    @Override
//    public void delete(Integer id) {
//        shelterRepository.delete(findById(id));
//    }
//
//    @Override
//    public void update(Integer id, Shelter newShelter) {
//        shelterRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Shelter not found!"))
//                .setName(newShelter.getName());
//        shelterRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Shelter not found!"))
//                .setAddress(newShelter.getAddress());
//    }
//}
