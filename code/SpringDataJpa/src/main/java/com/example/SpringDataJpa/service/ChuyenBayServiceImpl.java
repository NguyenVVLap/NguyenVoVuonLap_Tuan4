package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.ChuyenBay;
import com.example.SpringDataJpa.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<ChuyenBay> findAll() {
        return chuyenBayRepository.findAll();
    }

    @Override
    public List<ChuyenBay> findByGaDen(String gaDen) {
        return chuyenBayRepository.findByGaDen(gaDen);
    }

    @Override
    public List<ChuyenBay> findByDoDaiUnder10000Above8000() {
        return chuyenBayRepository.findByDoDaiUnder10000Above8000();
    }

    @Override
    public List<ChuyenBay> findBySaiGonToBuonMeThuoc() {
        return chuyenBayRepository.findBySaiGonToBuonMeThuoc();
    }

    @Override
    public int countChuyenBayFromSaiGon() {
        return chuyenBayRepository.countChuyenBayFromSaiGon();
    }
}