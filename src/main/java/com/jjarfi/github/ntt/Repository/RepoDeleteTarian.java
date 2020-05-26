package com.jjarfi.github.ntt.Repository;


import com.jjarfi.github.ntt.Model.DaoTarian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletetarian")
public interface RepoDeleteTarian extends CrudRepository<DaoTarian, Long> {
}
