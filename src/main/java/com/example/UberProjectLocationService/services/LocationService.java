package com.example.UberProjectLocationService.services;

import com.example.UberProjectLocationService.dto.DriverLocationDto;
import java.util.List;

public interface LocationService {

    Boolean saveDriverLocation(String driverId, Double latitude, Double longitude);

    List<DriverLocationDto> getNearByDrivers(Double latitude, Double longitude);

}

