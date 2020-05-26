package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoAdmin;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("repoadmin")
public interface RepositoryAdmin extends PagingAndSortingRepository<DaoAdmin, String> {

    DaoAdmin findByUsernameAndPasswordAndStatusTrue (String uname, String pass);

    DaoAdmin findByNama(String nama);

    DaoAdmin findByUsername(String username);

    @Override
    Optional<DaoAdmin> findById(String id);

    @Override
    List<DaoAdmin> findAll();

}
