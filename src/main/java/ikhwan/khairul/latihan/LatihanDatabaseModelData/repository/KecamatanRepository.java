/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhwan.khairul.latihan.LatihanDatabaseModelData.repository;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kecamatan;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author St0rm
 */
public interface KecamatanRepository extends CrudRepository<Kecamatan, Long> {
    List<Kecamatan> findAll();
    Kecamatan findByNama(String nama);
}
