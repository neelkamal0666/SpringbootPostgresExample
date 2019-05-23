package com.Fyle.banking.dao;

import com.Fyle.banking.domain.BanksDomain;
import com.Fyle.banking.domain.BranchesDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface BanksRepository extends JpaRepository<BanksDomain, Long> {

}
