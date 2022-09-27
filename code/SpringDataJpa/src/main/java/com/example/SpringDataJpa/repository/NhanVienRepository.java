package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    @Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
    public List<NhanVien> findNhanVienLuongUnder10000();

    @Query(value = "select sum(luong) from nhanvien", nativeQuery = true)
    public int sumLuongForAllNhanVien();

    @Query(value = "SELECT nhanvien.manv FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE loai like '%Boeing%' " +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<String> findNhanVienDriveMayBayBoeing();

    @Query(value = "SELECT nhanvien.manv, nhanvien.ten, nhanvien.luong FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE maybay.mamb='747'" +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<NhanVien> findNhanVienDriveMayBayId747();

    @Query(value = "SELECT nhanvien.manv FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE maybay.loai like '%Boeing%' or maybay.loai like '%Airbus%'" +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<String> findNhanVienDriveMayBayBoeingAndAirbus();
}
