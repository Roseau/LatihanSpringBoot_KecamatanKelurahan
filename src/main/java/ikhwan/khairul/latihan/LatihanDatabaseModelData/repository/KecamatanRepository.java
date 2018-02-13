/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhwan.khairul.latihan.LatihanDatabaseModelData.repository;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kecamatan;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author St0rm
 */
public interface KecamatanRepository extends CrudRepository<Kecamatan, Long> {
    List<Kecamatan> findAll();
    Kecamatan findByNama(String nama);
    
    @Transactional
    @Query(value = "insert into wilayah.list_kelurahan(id_kelurahan, id_kecamatan) values (?1,?2)", nativeQuery = true)
    public void addKelurahan(int idkel, int idkec);
}
