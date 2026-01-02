package com.yugurekaze.blogplatform.services.impl;

import com.yugurekaze.blogplatform.domain.entities.Category;
import com.yugurekaze.blogplatform.repository.CategoryRepository;
import com.yugurekaze.blogplatform.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();

    }
}
