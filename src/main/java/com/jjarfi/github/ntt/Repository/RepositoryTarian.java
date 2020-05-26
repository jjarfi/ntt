package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoTarian;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("tarian")
public interface RepositoryTarian extends PagingAndSortingRepository<DaoTarian, String> {

    @Override
    List<DaoTarian> findAll();

    List<DaoTarian> findBySuku(int suku);

    @Override
    Optional<DaoTarian> findById(String id);
}
