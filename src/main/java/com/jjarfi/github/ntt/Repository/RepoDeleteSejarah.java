package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoSejarah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletesejarah")
public interface RepoDeleteSejarah extends CrudRepository<DaoSejarah, String> {
}
