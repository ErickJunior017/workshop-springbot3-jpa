package com.erickaulas.course.repositories;

import com.erickaulas.course.entities.Category;
import com.erickaulas.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
