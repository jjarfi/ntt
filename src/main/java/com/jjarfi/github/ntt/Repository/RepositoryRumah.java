package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoRumah;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("rumah")
public interface RepositoryRumah extends PagingAndSortingRepository<DaoRumah, String> {

    @Override
    List<DaoRumah> findAll();

    List<DaoRumah> findBySuku(int suku);

    DaoRumah findById(Long id);
}
