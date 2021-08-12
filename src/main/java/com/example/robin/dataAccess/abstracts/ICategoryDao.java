package com.example.robin.dataAccess.abstracts;

import com.example.robin.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,String> {
}
