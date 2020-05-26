package com.jjarfi.github.ntt.Service;

import com.jjarfi.github.ntt.Model.DaoMusik;
import com.jjarfi.github.ntt.Repository.RepoDeleteMusik;
import com.jjarfi.github.ntt.Repository.RepositoryMusik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusikService {
    @Autowired
    private RepositoryMusik repomusik;
    @Autowired
    private RepoDeleteMusik repoDeleteMusik;

    //Get All Musik
    public List<DaoMusik> getAllMusik() {
        return this.repomusik.findAll();
    }

    //Get Musik By Nama Suku
    public DaoMusik getMusikbyNama(String namamusik) {
        return this.repomusik.findByNamamusik(namamusik);
    }

    //Get All Musik By Suku Id
    public List<DaoMusik> getMusikSukuById(Integer suku) {
        return this.repomusik.findBySuku(suku);
    }

    //Get total Musik
    public long getCount(){
        return this.repomusik.count();
    }
    //Save
    public void save(DaoMusik musik) {
        repomusik.save(musik);
    }
    public Optional<DaoMusik> getId(String id){
        return repomusik.findById(id);
    }

    public void delete(String id) {
        this.repoDeleteMusik.deleteById(id);
    }
}
