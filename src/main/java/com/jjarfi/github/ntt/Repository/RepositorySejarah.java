package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoSejarah;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("sejarah")
public interface RepositorySejarah extends PagingAndSortingRepository<DaoSejarah, String> {

    @Override
    List<DaoSejarah> findAll();

    DaoSejarah findByNamasejarah(String namasejarah);

    @Override
    Optional<DaoSejarah> findById(String id);



    List<DaoSejarah> findBySuku(String suku);

}
