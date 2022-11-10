package com.ninjaone.backendinterviewproject.service;

import com.ninjaone.backendinterviewproject.model.Device;

public interface DeviceService {
  
    Device addDevice(Device device);

    Device getDevice(String id);

    void removeDevice(String id);
}
