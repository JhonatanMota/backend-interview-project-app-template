package com.ninjaone.backendinterviewproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ninjaone.backendinterviewproject.model.Device;
import com.ninjaone.backendinterviewproject.service.DeviceServiceImpl;


@RestController
@RequestMapping("/v1/device")
public class DeviceController {

    @Autowired
    private DeviceServiceImpl deviceService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Device addDevice(@RequestBody Device deviceRequest){
        return deviceService.addDevice(deviceRequest);         
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private Device getDevice(@PathVariable String id){
        return deviceService.getDevice(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void removeDevice(@PathVariable String id){
        deviceService.removeDevice(id);
    }
}
