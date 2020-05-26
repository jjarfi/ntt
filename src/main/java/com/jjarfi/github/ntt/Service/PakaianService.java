package com.jjarfi.github.ntt.Service;


import com.jjarfi.github.ntt.Model.DaoPakaian;
import com.jjarfi.github.ntt.Repository.RepoDeletePakaian;
import com.jjarfi.github.ntt.Repository.RepositoryPakaian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PakaianService {

    @Autowired
    private RepositoryPakaian repopakaian;


    @Autowired
    private RepoDeletePakaian repoDeletePakaian;

    //Get Semua data pakaian adat
    public List<DaoPakaian> getAllPakaian() {
        return this.repopakaian.findAll();
    }


    //Get Semua data pakaian adat
    public List<DaoPakaian> getPakaianBySukuId(String suku) {
        return this.repopakaian.findBySuku(suku);
    }

    //Get Total Pakaian
    public long getCount() {
        return this.repopakaian.count();
    }

    //Save
    public void save(DaoPakaian pakaian) {
        repopakaian.save(pakaian);
    }
    public Optional<DaoPakaian> getId(String id){
        return repopakaian.findById(id);
    }
    public void delete(String id) {
        this.repoDeletePakaian.deleteById(id);
    }

}
