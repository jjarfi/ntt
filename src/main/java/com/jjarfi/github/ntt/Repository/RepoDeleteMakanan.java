package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoMakanan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletemakanan")
public interface RepoDeleteMakanan extends CrudRepository<DaoMakanan, Long> {
}
