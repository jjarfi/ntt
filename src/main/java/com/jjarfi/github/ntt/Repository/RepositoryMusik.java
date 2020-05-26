package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoMusik;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("musik")
public interface RepositoryMusik extends PagingAndSortingRepository<DaoMusik, String> {

    @Override
    List<DaoMusik> findAll();

    DaoMusik findByNamamusik(String nama);

    List<DaoMusik> findBySuku(int suku);

    DaoMusik findById(Long id);

}
