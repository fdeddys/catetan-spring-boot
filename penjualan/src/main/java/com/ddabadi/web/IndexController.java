/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ddabadi.web;

import com.ddabadi.domain.Barang;
import com.ddabadi.domain.BarangRepository;
import com.ddabadi.service.BarangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @Autowired BarangRepository barangRepository;
    @Autowired BarangService barangService;
    
    @RequestMapping(value = "tes",
                    method = RequestMethod.GET, 
                    produces = "application/json")
    public List<Barang> idx(){                
        return barangRepository.findAll();
    }
    
    @RequestMapping(value = "save/{nama}")
    public void saveBarang(@PathVariable("nama")String nama){
        barangService.save(nama);
    }        
}
