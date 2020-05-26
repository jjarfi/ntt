package com.jjarfi.github.ntt.Service;

import com.jjarfi.github.ntt.Model.DaoRumah;
import com.jjarfi.github.ntt.Repository.RepoDeleteRumah;
import com.jjarfi.github.ntt.Repository.RepositoryRumah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RumahService {
    @Autowired
    private RepositoryRumah reporumah;

    @Autowired
    private RepoDeleteRumah repoDeleteRumah;

    //Get Semua data rumah adat
    public List<DaoRumah> getAllRumah() {
        return this.reporumah.findAll();
    }

    //Get Data jumlah rumah adat
    public long getCount() {
        return this.reporumah.count();
    }

    //Get Semua data rumah adat berdasrkan suku
    public List<DaoRumah> getRumahSukuByid(Integer suku) {
        return this.reporumah.findBySuku(suku);
    }

    //Save
    public void save(DaoRumah rumah) {
        reporumah.save(rumah);
    }

    public DaoRumah getId(Long id){
        return reporumah.findById(id);
    }
    public void delete(Long id) {
        this.repoDeleteRumah.deleteById(id);
    }
}
