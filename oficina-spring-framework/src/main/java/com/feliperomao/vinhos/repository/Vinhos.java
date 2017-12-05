package com.feliperomao.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feliperomao.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

}
