package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoMusik;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("musik")
public interface RepositoryMusik extends PagingAndSortingRepository<DaoMusik, String> {

    @Override
    List<DaoMusik> findAll();

    DaoMusik findByNamamusik(String nama);

    List<DaoMusik> findBySuku(int suku);

    @Override
    Optional<DaoMusik> findById(String id);

}
