package com.jjarfi.github.ntt.Service;


import com.jjarfi.github.ntt.Model.DaoSejarah;
import com.jjarfi.github.ntt.Repository.RepoDeleteSejarah;
import com.jjarfi.github.ntt.Repository.RepositorySejarah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SejarahService {
    @Autowired
    private RepositorySejarah reposejarah;
    @Autowired
    private RepoDeleteSejarah repoDeleteSejarah;


    //Get Data Semua Suku
    public List<DaoSejarah> getAllSejarah() {
        return this.reposejarah.findAll();
    }

    //Cari Sejarah berdasarkan nama sejarah
    public DaoSejarah findSejarah(String sejarah) {
        return this.reposejarah.findByNamasejarah(sejarah);
    }

    //Get (Tampilkan jumlah Sejarah yang terdaftar di database)
    public long getCount() {
        return this.reposejarah.count();
    }

    //Cari sejarah berdasrkan id suku
    public DaoSejarah findSejarahById(Long id) {
        return this.reposejarah.findById(id);
    }

    public List<DaoSejarah> findSuku(Integer suku) {
        return this.reposejarah.findBySuku(suku);
    }

    //Save
    public void save(DaoSejarah rumah) {
        reposejarah.save(rumah);
    }

    public DaoSejarah getId(Long id){
        return reposejarah.findById(id);
    }
    public void delete(Long id) {
        this.repoDeleteSejarah.deleteById(id);
    }

}
