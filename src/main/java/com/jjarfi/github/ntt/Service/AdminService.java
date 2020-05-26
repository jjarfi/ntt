package com.jjarfi.github.ntt.Service;


import com.jjarfi.github.ntt.Model.DaoAdmin;
import com.jjarfi.github.ntt.Repository.RepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public DaoAdmin getId(Long id) {
        return repoadmin.findById(id);
    }
}
