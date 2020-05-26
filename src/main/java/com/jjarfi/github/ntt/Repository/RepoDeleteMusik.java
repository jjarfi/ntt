package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoMusik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletemusik")
public interface RepoDeleteMusik extends CrudRepository<DaoMusik, String> {
}
