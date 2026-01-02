package com.yugurekaze.blogplatform.services;

import com.yugurekaze.blogplatform.domain.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategories();
}
