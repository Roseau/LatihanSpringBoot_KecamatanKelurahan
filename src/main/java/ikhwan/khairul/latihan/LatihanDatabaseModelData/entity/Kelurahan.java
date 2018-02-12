/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikhwan.khairul.latihan.LatihanDatabaseModelData.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author St0rm
 */
@Entity
@Table(name = "master_kelurahan", schema="wilayah")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kelurahan {
    @Id
    @SequenceGenerator(
            name = "kelurahan_wilayah_seq",
            schema = "wilayah",
            allocationSize = 1,
            initialValue = 1,
            sequenceName = "kelurahan_seq"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kelurahan_wilayah_seq")
    @Column(name = "id_kelurahan", nullable = false, unique = true)
    private int id;
    
    @Column(name = "nama_kelurahan", nullable = false, unique = true)
    private String nama;
    
    @Column(name = "kodepos")
    private String kodepos;
    
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
}
