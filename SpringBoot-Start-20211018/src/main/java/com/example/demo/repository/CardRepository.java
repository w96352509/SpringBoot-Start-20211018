package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.one2one.Card;
import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Person;

@Repository
public interface CardRepository extends JpaRepository<Card,Long>{
  
}
