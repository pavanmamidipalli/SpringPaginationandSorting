package com.example.SpringBootPaginationAndSorting.service;

import com.example.SpringBootPaginationAndSorting.entity.VaccineDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface IVaccineService {
//    public Iterable<VaccineDetails> addALl(Iterable<VaccineDetails> vaccineDetails);
    public Iterable<VaccineDetails> sortTheDetails(Boolean status,String... properties);
    public Page<VaccineDetails> paginationOfDetails(int pageNo,int pageSize,Boolean status,String... properties);
    public void pagination(int pageno);
}
