package com.gasbooking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gasbooking.app.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer> {

}
