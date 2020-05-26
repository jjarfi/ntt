package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoSuku;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletesuku")
public interface RepoDeleteSuku extends CrudRepository<DaoSuku, String> {
}
