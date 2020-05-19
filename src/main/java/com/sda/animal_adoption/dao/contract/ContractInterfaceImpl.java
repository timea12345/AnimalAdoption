//package com.sda.animal_adoption.dao.contract;
//
//import com.sda.animal_adoption.model.Contract;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class ContractInterfaceImpl implements ContractInterface {
//
//    private ContractRepository contractRepository;
//
//    @Autowired
//    public ContractInterfaceImpl(ContractRepository contractRepository) {
//        this.contractRepository = contractRepository;
//    }
//
//    @Override
//    public void save(Contract contract) {
//        contractRepository.save(contract);
//    }
//
//    @Override
//    public void update(Integer id, Contract contract) {
//        contractRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Contract not found!"))
//                .setComments(contract.getComments());
//    }
//
//    @Override
//    public void delete(Integer id) {
//        contractRepository.delete(findById(id));
//    }
//
//    @Override
//    public Contract findById(Integer id) {
//        return contractRepository.findById(id)
//                .orElseThrow(() -> new NullPointerException("Contract not found!"));
//    }
//
//    @Override
//    public List<Contract> findAll() {
//        return contractRepository.findAll();
//    }
//}
