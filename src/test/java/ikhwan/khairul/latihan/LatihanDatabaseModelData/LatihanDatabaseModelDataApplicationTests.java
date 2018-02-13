package ikhwan.khairul.latihan.LatihanDatabaseModelData;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kecamatan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kelurahan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.service.WilayahService;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LatihanDatabaseModelDataApplicationTests extends TestCase{
        @Autowired
        private WilayahService wilayahservice;
        
	@Test
	public void contextLoads() {
	}
        
        @Test
        public void TestKelurahanProvinsi(){
            List<Kecamatan> listKecamatan = wilayahservice.getAllKecamatan();
            assertEquals(3, listKecamatan.size());
            List<Kelurahan> listKelurahan = wilayahservice.getAllKelurahan();
            assertEquals(4, listKelurahan.size());
            
            Kecamatan Andir = wilayahservice.getKecamatanByName("Andir");
            assertNotNull(Andir);
            assertEquals(4, Andir.getListKelurahan().size());
        }
        @Test
        public void addKelurahanPropinsi(){
//            Kecamatan Arcamanik = new Kecamatan();
//            Arcamanik.setNama("Arcamanik");
//            Arcamanik.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
//            wilayahservice.saveKecamatan(Arcamanik);
//            Kelurahan Garuda = new Kelurahan();
//            Garuda.setNama("Garuda");
//            Garuda.setKodepos("40184");
//            Garuda.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
//            wilayahservice.saveKelurahan(Garuda);
//              Kecamatan Andir = wilayahservice.getKecamatanByName("Andir");
//              assertNotNull(Andir);
//              assertEquals(1, Andir.getId());
//              Kelurahan Garuda = wilayahservice.getKelurahanByName("Garuda");
//              assertNotNull(Garuda);
//              assertEquals(4, Garuda.getId());
//              Andir.getListKelurahan().add(Garuda);
//              wilayahservice.saveKecamatan(Andir);
        }

}
