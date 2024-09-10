package com.example.SpringBootPaginationAndSorting.repo;

import com.example.SpringBootPaginationAndSorting.entity.VaccineDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends PagingAndSortingRepository<VaccineDetails,Integer> {
}
