package com.pairlearning.expensetracker.repository;

import com.pairlearning.expensetracker.exceptions.EtBadRequestException;
import com.pairlearning.expensetracker.exceptions.EtResourcesNotFoundException;
import com.pairlearning.expensetracker.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourcesNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourcesNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
