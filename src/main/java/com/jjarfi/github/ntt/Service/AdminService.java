package com.jjarfi.github.ntt.Service;


import com.jjarfi.github.ntt.Model.DaoAdmin;
import com.jjarfi.github.ntt.Repository.RepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private RepositoryAdmin repoadmin;

    public List<DaoAdmin> getAdmin() {
        return this.repoadmin.findAll();
    }

    public DaoAdmin getLogin(String uname, String pass) {
        return repoadmin.findByUsernameAndPasswordAndStatusTrue(uname, pass);
    }

    public DaoAdmin findByNama(String nama) {
        return repoadmin.findByNama(nama);
    }

    public Optional<DaoAdmin> getId(String id) {
        return repoadmin.findById(id);
    }
}
