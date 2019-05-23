package com.Fyle.banking.dao;

import com.Fyle.banking.domain.BranchesDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BranchesRepository extends JpaRepository<BranchesDomain, Long> {
    BranchesDomain findByIfsc(String ifsc);

//    @Query(value = "select BranchesDomain from BranchesDomain br where br.city=:city")
//    List<BranchesDomain> findByCity(@Param("city") String city);

      List<BranchesDomain> findByCityAndBank_Name(String city, String name);
}
