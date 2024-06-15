package com.example.__DuongHoangLong.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Column(name = "ma_phong", length = 2, nullable = false)
    private String Ma_Phong;

    @Column(name = "ten_phong", length = 30, nullable = false)
    private String Ten_Phong;
}