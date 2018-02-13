/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhwan.khairul.latihan.LatihanDatabaseModelData.repository;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kelurahan;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author St0rm
 */
public interface KelurahanRepository extends CrudRepository<Kelurahan, Long> {
    List<Kelurahan> findAll();
    Kelurahan findByNama(String nama);
}
