package com.pairlearning.expensetracker.services;

import com.pairlearning.expensetracker.exceptions.EtResourcesNotFoundException;
import com.pairlearning.expensetracker.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourcesNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtResourcesNotFoundException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtResourcesNotFoundException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourcesNotFoundException; //note that simply removing a category won't work,

    // each category can have multiple transactions,
    // so before deleting a category, first of all we have to remove all of the transactions and then to remove the category this is known as Cascade glade

}
