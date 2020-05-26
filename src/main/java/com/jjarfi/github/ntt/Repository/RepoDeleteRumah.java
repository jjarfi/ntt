package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoRumah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeleterumah")
public interface RepoDeleteRumah extends CrudRepository<DaoRumah, Long> {
}
