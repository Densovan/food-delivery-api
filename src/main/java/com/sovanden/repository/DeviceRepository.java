package com.sovanden.repository;

import com.sovanden.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository  extends JpaRepository <Device,Long> {
}
