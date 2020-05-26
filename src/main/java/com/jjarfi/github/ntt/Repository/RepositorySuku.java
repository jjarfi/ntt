package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoSuku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("suku")
public interface RepositorySuku extends JpaRepository<DaoSuku, String > {
    @Override
    List<DaoSuku> findAll();

    DaoSuku findByNamasuku(String suku);

  //  DaoSuku deleteById(Long id);

    @Override
    Optional<DaoSuku> findById(String id);
}
