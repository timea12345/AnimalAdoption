//package com.sda.animal_adoption.dao.donation;
//
//import com.sda.animal_adoption.model.Donation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class DonationRepositoryImpl implements DonationInterface {
//
//    private DonationRepository donationRepository;
//
//    @Autowired
//    public DonationRepositoryImpl(DonationRepository donationRepository) {
//        this.donationRepository = donationRepository;
//    }
//
//    @Override
//    public void save(Donation donation) {
//        donationRepository.save(donation);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        donationRepository.delete(findById(id));
//    }
//
//    @Override
//    public void update(Integer id, Donation donation) {
//        donationRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Donation not found!"))
//                .setDetails(donation.getDetails());
//        donationRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Donation not found!"))
//                .setSum(donation.getSum());
//    }
//
//    @Override
//    public List<Donation> findAll() {
//        return donationRepository.findAll();
//    }
//
//    @Override
//    public Donation findById(Integer id) {
//        return donationRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Donation not found!"));
//    }
//}
