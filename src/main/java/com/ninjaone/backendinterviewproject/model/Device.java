package com.ninjaone.backendinterviewproject.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ninjaone.backendinterviewproject.commons.enums.AvailableServices;
import com.ninjaone.backendinterviewproject.commons.enums.DeviceType;

import lombok.Data;

@Entity
@Data
public class Device {
    @Id
    private long id;

    private String systemName;
    private DeviceType type;

    private Set<AvailableServices> services;

    public Device getInstance(){
        if(type.equals(DeviceType.MAC)) return new MacDevice();
        else return new WindowsDevice();        
    }
}
