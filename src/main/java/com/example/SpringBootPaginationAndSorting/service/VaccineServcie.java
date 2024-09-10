package com.example.SpringBootPaginationAndSorting.service;

import com.example.SpringBootPaginationAndSorting.entity.VaccineDetails;
import com.example.SpringBootPaginationAndSorting.repo.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class VaccineServcie implements IVaccineService{
    @Autowired
    private VaccineRepository vaccineRepository;

    @Override
    public Iterable<VaccineDetails> sortTheDetails(Boolean status,String... properties) {
          Sort sort= Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,properties);
           return vaccineRepository.findAll(sort);
    }

    @Override
    public Page<VaccineDetails> paginationOfDetails(int pageNo, int pageSize, Boolean status, String... properties) {
       Pageable pageable= PageRequest.of(pageNo,pageSize,status? Sort.Direction.ASC : Sort.Direction.DESC,properties);
       return vaccineRepository.findAll(pageable);
    }

    @Override
    public void pagination(int pageno) {
        int count = 4;
        int pagecount = count / pageno;
        pagecount=count/pageno==0? pagecount:pagecount++;
        for (int i = 0; i < pagecount; i++) {
            Pageable pageable = PageRequest.of(i, pageno);
            vaccineRepository.findAll(pageable).forEach(j-> System.out.println(j.getVaccineCompany()+" >> "+j.getVaccineName()));
        }

    }


//    @Override
//    public Iterable<VaccineDetails> addALl(Iterable<VaccineDetails> vaccineDetails) {
//
//        return vaccineRepository.saveAll(vaccineDetails);
//    }
}
