package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoPakaian;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("pakaian")
public interface RepositoryPakaian extends PagingAndSortingRepository<DaoPakaian, String> {

    @Override
    List<DaoPakaian> findAll();

    List<DaoPakaian> findBySuku(int suku);

    @Override
    Optional<DaoPakaian> findById(String id);
}
