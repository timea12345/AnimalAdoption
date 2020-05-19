package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.contract.ContractRepository;
import com.sda.animal_adoption.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    private ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    public void delete(Integer id) {
        contractRepository.delete(findById(id));
    }

    public Contract findById(Integer id) {
        return contractRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Contract not found!"));
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
