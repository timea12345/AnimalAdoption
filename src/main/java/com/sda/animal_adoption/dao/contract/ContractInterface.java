package com.sda.animal_adoption.dao.contract;

import com.sda.animal_adoption.model.Contract;
import java.util.List;

public interface ContractInterface {

    void save(Contract contract);
    void update(Integer id, Contract contract);
    void delete(Integer id);
    Contract findById(Integer id);
    List<Contract> findAll();

}
