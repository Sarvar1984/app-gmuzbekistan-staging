package uz.digitalone.appgmuzbekistan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.appgmuzbekistan.service.AddressService;
import uz.digitalone.appgmuzbekistan.service.impl.AddressServiceImpl;

@RestController
@RequestMapping(value = "api/v1/address")
public class AddressController {
    public static AddressService addressService=new AddressServiceImpl();



}
