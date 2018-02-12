package ikhwan.khairul.latihan.LatihanDatabaseModelData;

import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kecamatan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.entity.Kelurahan;
import ikhwan.khairul.latihan.LatihanDatabaseModelData.service.WilayahService;
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
            assertEquals(2, listKecamatan.size());
//            List<Kelurahan> listKelurahan = wilayahservice.getAllKelurahan();
//            assertEquals(3, listKelurahan.size());
//            
//            Kecamatan Andir = wilayahservice.getKecamatanByName("Andir");
//            assertNotNull(Andir);
//            assertEquals(2, Andir.getListKelurahan().size());
        }

}
