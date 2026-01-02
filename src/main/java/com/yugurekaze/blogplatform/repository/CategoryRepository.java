package com.yugurekaze.blogplatform.repository;

import com.yugurekaze.blogplatform.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

    @Query("SELECT c FROM Category c JOIN FETCH c.posts")
    List<Category> findAllWithPostCount();
}
