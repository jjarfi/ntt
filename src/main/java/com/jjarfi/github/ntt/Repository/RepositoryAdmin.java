package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoAdmin;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repoadmin")
public interface RepositoryAdmin extends PagingAndSortingRepository<DaoAdmin, String> {

    DaoAdmin findByUsernameAndPasswordAndStatusTrue (String uname, String pass);

    DaoAdmin findByNama(String nama);

    DaoAdmin findByUsername(String username);

    DaoAdmin findById(Long id);

    @Override
    List<DaoAdmin> findAll();

}
