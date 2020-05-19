package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.donation.DonationRepository;
import com.sda.animal_adoption.model.Contract;
import com.sda.animal_adoption.model.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    private DonationRepository donationRepository;

    @Autowired
    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }

    public void delete(Integer id) {
        donationRepository.delete(findById(id));
    }

    public Donation findById(Integer id) {
        return donationRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Donation not found!"));
    }

    public List<Donation> findAll() {
        return donationRepository.findAll();
    }
}
