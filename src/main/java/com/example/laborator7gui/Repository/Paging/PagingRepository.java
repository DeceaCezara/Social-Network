package com.example.laborator7gui.Repository.Paging;


import com.example.laborator7gui.Domain.Entity;
import com.example.laborator7gui.Repository.Repository;

public interface PagingRepository<ID , E extends Entity<ID>> extends Repository<ID, E> {

    Page<E> findAll(Pageable pageable);
}
