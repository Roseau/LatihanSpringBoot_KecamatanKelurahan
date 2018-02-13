/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  St0rm
 * Created: Feb 12, 2018
 */
create schema wilayah;

create sequence wilayah.kelurahan_seq
    start 1
    increment 1;

create sequence wilayah.kecamatan_seq
    start 1
    increment 1;

create table wilayah.master_kelurahan(
    id_kelurahan int4 primary key not null default nextval('wilayah.kelurahan_seq'),
    nama_kelurahan character varying(255) not null unique,
    kodepos character varying(255),
    created_date timestamp not null
);

create table wilayah.master_kecamatan(
    id_kecamatan int4 not null primary key default nextval('wilayah.kecamatan_seq'),
    nama_kecamatan character varying(255) not null unique,
    created_date timestamp not null
);

create table wilayah.list_kelurahan(
    id_kelurahan int4 not null references wilayah.master_kelurahan(id_kelurahan),
    id_kecamatan int4 not null references wilayah.master_kecamatan(id_kecamatan)
);
