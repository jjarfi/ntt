package com.jjarfi.github.ntt.Service;

import com.jjarfi.github.ntt.Model.DaoTarian;
import com.jjarfi.github.ntt.Repository.RepoDeleteTarian;
import com.jjarfi.github.ntt.Repository.RepositoryTarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarianService {

    @Autowired
    private RepositoryTarian repotarian;

    @Autowired
    private RepoDeleteTarian repoDeleteTarian;

    //get All tarian
    public List<DaoTarian> getALlTarian() {
        return this.repotarian.findAll();
    }

    //Get jumlah tarian
    public long getCount() {
        return this.repotarian.count();
    }
    //get All tarian Suku By Id
    public List<DaoTarian> getTarianSukuById(Integer suku) {
        return this.repotarian.findBySuku(suku);
    }
    //Save
    public void save(DaoTarian tarian) {
        repotarian.save(tarian);
    }
    public DaoTarian getId(Long id){
        return repotarian.findById(id);
    }

    public void delete(Long id) {
        this.repoDeleteTarian.deleteById(id);
    }
}
