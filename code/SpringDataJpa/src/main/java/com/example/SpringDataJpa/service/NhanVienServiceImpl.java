package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements  NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> findNhanVienLuongUnder10000() {
        return nhanVienRepository.findNhanVienLuongUnder10000();
    }

    @Override
    public int sumLuongForAllNhanVien() {
        return nhanVienRepository.sumLuongForAllNhanVien();
    }

    @Override
    public List<String> findNhanVienDriveMayBayBoeing() {
        return nhanVienRepository.findNhanVienDriveMayBayBoeing();
    }

    @Override
    public List<NhanVien> findNhanVienDriveMayBayId747() {
        return nhanVienRepository.findNhanVienDriveMayBayId747();
    }

    @Override
    public List<String> findNhanVienDriveMayBayBoeingAndAirbus() {
        return nhanVienRepository.findNhanVienDriveMayBayBoeingAndAirbus();
    }
}