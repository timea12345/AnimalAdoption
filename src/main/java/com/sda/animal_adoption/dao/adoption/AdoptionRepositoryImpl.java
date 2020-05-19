//package com.sda.animal_adoption.dao.adoption;
//
//import com.sda.animal_adoption.model.Adoption;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class AdoptionRepositoryImpl implements AdoptionInterface {
//
//    private AdoptionRepository adoptionRepository;
//
//    @Autowired
//    public AdoptionRepositoryImpl(AdoptionRepository adoptionRepository) {
//        this.adoptionRepository = adoptionRepository;
//    }
//
//    @Override
//    public Adoption findById(Integer id) {
//        return adoptionRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Adoption not found!"));
//    }
//
//    @Override
//    public List<Adoption> findAll() {
//        return adoptionRepository.findAll();
//    }
//
//    @Override
//    public void save(Adoption adoption) {
//        adoptionRepository.save(adoption);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        adoptionRepository.delete(findById(id));
//    }
//
//    @Override
//    public void update(Integer id, Adoption adoption) {
//        adoptionRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Adoption not found!"))
//                .setDescription(adoption.getDescription());
//    }
//}
