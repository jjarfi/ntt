package com.jjarfi.github.ntt.Service;

import com.jjarfi.github.ntt.Model.DaoMakanan;
import com.jjarfi.github.ntt.Repository.RepoDeleteMakanan;
import com.jjarfi.github.ntt.Repository.RepositoryMakanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakananService {
    @Autowired
    private RepositoryMakanan repomakan;

    @Autowired
    private RepoDeleteMakanan repoDeleteMakanan;

    //Menampilakan semua manakan
    public List<DaoMakanan> getAllMakanan() {
        return this.repomakan.findAll();
    }

    //Cari Makanan berdasarkan nama makanan
    public DaoMakanan getMakanan(String nama) {
        return this.repomakan.findByNamamakanan(nama);
    }

    //Cari makanan
    public DaoMakanan findOne(String id) {
        return this.findOne(id);
    }

    //Menampilakan semua manakan
    public List<DaoMakanan> getMakananSukuById(Long suku) {
        return this.repomakan.findBySuku(suku);
    }

    //Get Total Makanan
    public long getCount() {
        return this.repomakan.count();
    }

    //Save
    public void save(DaoMakanan makanan) {
            repomakan.save(makanan);
    }
    public DaoMakanan getId(Long id){
        return repomakan.findById(id);
    }

    public void delete(Long id) {
        this.repoDeleteMakanan.deleteById(id);
    }
}
