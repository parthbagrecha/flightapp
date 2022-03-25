package com.flightapp.user.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.user.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

}
