package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.DTO.productDTO;


public interface productrepository extends JpaRepository<productDTO, Integer>{

}
