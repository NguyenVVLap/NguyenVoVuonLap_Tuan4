package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    public List<ChuyenBay> findByGaDen(String gaDen);

    @Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
    public List<ChuyenBay> findByDoDaiUnder10000Above8000();

    @Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
    public List<ChuyenBay> findBySaiGonToBuonMeThuoc();

    @Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
    public int countChuyenBayFromSaiGon();


}
