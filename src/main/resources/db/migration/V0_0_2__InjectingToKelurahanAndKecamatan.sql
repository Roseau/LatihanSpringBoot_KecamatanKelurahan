/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  St0rm
 * Created: Feb 12, 2018
 */
insert into wilayah.master_kelurahan(nama_kelurahan, kodepos, created_date) values
           ('Campaka','40184',now()),
           ('Ciroyom','40182',now()),
           ('Antapani Kidul','40291',now());

insert into wilayah.master_kecamatan(nama_kecamatan, created_date) values
            ('Andir',now()),
            ('Antapani',now());

insert into wilayah.list_kelurahan(id_kelurahan, id_kecamatan) values 
            ((select id_kelurahan from wilayah.master_kelurahan where nama_kelurahan='Campaka'),(select id_kecamatan from wilayah.master_kecamatan where nama_kecamatan='Andir')),
            ((select id_kelurahan from wilayah.master_kelurahan where nama_kelurahan='Ciroyom'),(select id_kecamatan from wilayah.master_kecamatan where nama_kecamatan='Andir')),
            ((select id_kelurahan from wilayah.master_kelurahan where nama_kelurahan='Antapani Kidul'),(select id_kecamatan from wilayah.master_kecamatan where nama_kecamatan='Antapani'));