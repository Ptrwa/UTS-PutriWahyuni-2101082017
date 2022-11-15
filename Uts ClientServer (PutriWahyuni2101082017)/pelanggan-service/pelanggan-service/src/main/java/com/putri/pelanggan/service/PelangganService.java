/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.putri.pelanggan.service;

import com.putri.pelanggan.entity.Pelanggan;
import com.putri.pelanggan.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ASUS
 */
public class PelangganService {
     @Autowired
    private PelangganRepository pelangganRepository;
    private Long pelangganID;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public Pelanggan findPelangganByID(Long PelangganID){
        return pelangganRepository.findByPelangganID(pelangganID);
    }
}
