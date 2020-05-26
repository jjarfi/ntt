package com.jjarfi.github.ntt.Service;

import com.jjarfi.github.ntt.Model.DaoSuku;
import com.jjarfi.github.ntt.Repository.RepoDeleteSuku;
import com.jjarfi.github.ntt.Repository.RepositorySuku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class SukuService {

    @Autowired
    private RepositorySuku reposuku;

    @Autowired
    private RepoDeleteSuku repoDeleteSuku;

    public List<DaoSuku> getAllSuku() {
        return this.reposuku.findAll();
    }

    public DaoSuku getSuku(String suku) {
        return this.reposuku.findByNamasuku(suku);
    }

    public long getCount() {
        return this.reposuku.count();
    }

    public void save(DaoSuku suku) {
        DaoSuku ifExist = reposuku.findByNamasuku(suku.getNamasuku());
        if (ifExist != null) {

        } else {
            reposuku.save(suku);
        }
    }

    public DaoSuku findAllById(String suku) {
        return (DaoSuku) reposuku.findAllById(Collections.singleton(suku));
    }


    public DaoSuku getId(Long id){
        return reposuku.findById(id);
    }
    public void delete(Long suku) {
         this.repoDeleteSuku.deleteById(suku);
    }
}
