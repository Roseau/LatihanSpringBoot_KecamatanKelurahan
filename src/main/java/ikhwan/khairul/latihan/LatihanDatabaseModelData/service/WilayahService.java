/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhwan.khairul.latihan.LatihanDatabaseModelData.service;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kecamatan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kelurahan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.repository.KecamatanRepository;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.repository.KelurahanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author St0rm
 */
@Repository
@Transactional(readOnly = false)
public class WilayahService {
    @Autowired
    private KecamatanRepository kecamatanrepo;
    
    @Autowired
    private KelurahanRepository kelurahanrepo;
    
    public List<Kecamatan> getAllKecamatan(){
        return this.kecamatanrepo.findAll();
    }
    
    public List<Kelurahan> getAllKelurahan(){
        return this.kelurahanrepo.findAll();
    }
    
    public Kecamatan getKecamatanByName(String nama){
        return this.kecamatanrepo.findByNama(nama);
    }
}
