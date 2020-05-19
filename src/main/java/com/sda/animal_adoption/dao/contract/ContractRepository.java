package com.sda.animal_adoption.dao.contract;

import com.sda.animal_adoption.model.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {

    List<Contract> findAll();
    Optional<Contract> findById(Integer id);
}
