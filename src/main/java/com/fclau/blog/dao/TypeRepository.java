package com.fclau.blog.dao;

import com.fclau.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.web.PageableDefault;

import java.util.List;

/**
 * Created by Edward on 2018/8/6
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);

    @Query("select t from Type t ")
    List<Type> findTop(Pageable pageable);
}
