package com.jjarfi.github.ntt.Endpoint;

import com.jjarfi.github.ntt.Model.*;
import com.jjarfi.github.ntt.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class NTTApi {
    @Autowired
    private SukuService sukuService;
    @Autowired
    private MakananService makananService;
    @Autowired
    private MusikService musikService;
    @Autowired
    private PakaianService pakaianService;
    @Autowired
    private SejarahService sejarahService;
    @Autowired
    private RumahService rumahService;
    @Autowired
    private TarianService tarianService;

    //Tampilakn Semua Data Suku
    @GetMapping("/suku")
    public Collection<DaoSuku> getAllSuku() {
        return sukuService.getAllSuku();
    }

    //Tampilkan Semua musik
    @GetMapping("/musik")
    public Collection<DaoMusik> getAllMusik() {
        return musikService.getAllMusik();
    }

    //Tampilkan Semua pakaian
    @GetMapping("/pakaian")
    public Collection<DaoPakaian> getAllPakaian() {
        return pakaianService.getAllPakaian();
    }

    //Tampilkan semua sejarah
    @GetMapping("/sejarah")
    public Collection<DaoSejarah> getAllSejarah() {
        return sejarahService.getAllSejarah();
    }

    //Tampilkan Semua rumah
    @GetMapping("/rumah")
    public Collection<DaoRumah> getAllRumah() {
        return rumahService.getAllRumah();
    }

    //Tampilkan Semua Makanan
    @GetMapping("/makanan")
    public Collection<DaoMakanan> getAllMakanan() {
        return makananService.getAllMakanan();
    }

    //Tampilkan semua tarian
    @GetMapping("/tarian")
    public Collection<DaoTarian> getAllTarian() {
        return tarianService.getALlTarian();
    }

    @RequestMapping("/suku/{suku}")
    public DaoSuku getSukuBy(@PathVariable String suku) {
        return sukuService.getSuku(suku);
    }

    //cari Makanan berdasarkan nama
    @RequestMapping("/makanan/{makanan}")
    public DaoMakanan getMakananBy(@PathVariable String makanan) {
        return makananService.getMakanan(makanan);
    }

    //cari Sejarah berdasarkan nama
    @RequestMapping("/sejarah/{sejarah}")
    public DaoSejarah getSejarahBy(@PathVariable String sejarah) {
        return sejarahService.findSejarah(sejarah);
    }

    //cari Sejarah berdasarkan Id
    @RequestMapping("/sejarah/id/{id}")
    public Optional<DaoSejarah> getSejarahById(@PathVariable String id) {
        return sejarahService.findSejarahById(id);
    }

    //cari Sejarah berdasarkan suku id
    @RequestMapping("/sejarah/suku/{id}")
    public Collection<DaoSejarah> getSejarahSukuById(@PathVariable String id) {
        return sejarahService.findSuku(id);
    }

    //cari Pakaian berdasarkan suku id
    @RequestMapping("/pakaian/suku/{id}")
    public Collection<DaoPakaian> getPakaianSukuById(@PathVariable String id) {
        return pakaianService.getPakaianBySukuId(id);
    }

    //cari Rumah berdasarkan suku id
    @RequestMapping("/rumah/suku/{id}")
    public Collection<DaoRumah> getRumahSukuById(@PathVariable String id) {
        return rumahService.getRumahSukuByid(id);
    }

    //cari Makanan berdasarkan suku id
    @RequestMapping("/makanan/suku/{id}")
    public Collection<DaoMakanan> getMakananSukuById(@PathVariable String id) {
        return makananService.getMakananSukuById(id);
    }

    //cari Musik berdasarkan suku id
    @RequestMapping("/musik/suku/{id}")
    public Collection<DaoMusik> getMusikSukuById(@PathVariable String id) {
        return musikService.getMusikSukuById(id);
    }

    //cari Tarian berdasarkan suku id
    @RequestMapping("/tarian/suku/{id}")
    public Collection<DaoTarian> getTarianSukuById(@PathVariable String id) {
        return tarianService.getTarianSukuById(id);
    }
}
