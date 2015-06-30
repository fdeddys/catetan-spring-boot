/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ddabadi.service;

import com.ddabadi.domain.Barang;
import com.ddabadi.domain.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edepe
 */

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired BarangRepository barangRepository;
    
    @Override
    public void save(String nama) {
        Barang barang = new Barang();
        barang.setNama(nama);
        barangRepository.save(barang);
    }
    
}
