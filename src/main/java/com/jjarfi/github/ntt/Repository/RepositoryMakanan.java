package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoMakanan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("makanan")
public interface RepositoryMakanan extends PagingAndSortingRepository<DaoMakanan, String> {

    @Override
    List<DaoMakanan> findAll();

    DaoMakanan findByNamamakanan(String nama);

    DaoMakanan findBySuku(String suku);

    List<DaoMakanan> findBySuku(Long suku);

    @Override
    Optional<DaoMakanan> findById(String id);

}
