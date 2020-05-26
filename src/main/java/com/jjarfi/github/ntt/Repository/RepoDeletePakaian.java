package com.jjarfi.github.ntt.Repository;

import com.jjarfi.github.ntt.Model.DaoPakaian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repodeletepakaian")
public interface RepoDeletePakaian extends CrudRepository<DaoPakaian, String> {
}
