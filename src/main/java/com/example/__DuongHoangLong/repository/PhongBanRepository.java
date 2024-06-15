package com.example.__DuongHoangLong.repository;

import com.example.__DuongHoangLong.entity.NhanVien;
import com.example.__DuongHoangLong.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}
