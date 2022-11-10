package com.ninjaone.backendinterviewproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjaone.backendinterviewproject.commons.exception.ResourceNotFoundException;
import com.ninjaone.backendinterviewproject.database.DeviceRepository;
import com.ninjaone.backendinterviewproject.model.Device;

@Service
public class DeviceServiceImpl implements DeviceService {

    private static final String ID_STR = "id";
    private static final String DEVICE_STR = "Device";

    @Autowired
    private DeviceRepository deviceRepository;

    @Override public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override public Device getDevice(String id){
        return deviceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(DEVICE_STR, ID_STR, id));
    }

    @Override public void removeDevice(String id) {
        deviceRepository.deleteById(id);
    }

}
