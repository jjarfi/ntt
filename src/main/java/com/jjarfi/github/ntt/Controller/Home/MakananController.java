package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoAdmin;
import com.jjarfi.github.ntt.Model.DaoMakanan;
import com.jjarfi.github.ntt.Model.DaoSuku;
import com.jjarfi.github.ntt.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Controller
public class MakananController {
    @Autowired
    private SukuService sukuService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private SejarahService sejarahService;
    @Autowired
    private RumahService rumahService;
    @Autowired
    private TarianService tarianService;
    @Autowired
    private PakaianService pakaianService;
    @Autowired
    private MakananService makananService;
    @Autowired
    private MusikService musikService;

    @GetMapping("/makanan")
    public String getMakanan(DaoMakanan makanan, DaoAdmin admin, ModelMap modelMap) {
        modelMap.addAttribute("tabelMakanan", makananService.getAllMakanan());
        modelMap.addAttribute("makanan", makanan);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "makanan";
    }

    @GetMapping("/makanan/add")
    public String addMakanan(DaoMakanan makanan, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("makanan", makanan);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "tambah-makanan";
    }

    @PostMapping("/makanan/save")
    public String getSave( DaoMakanan makanan) {
        makanan.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        makanan.setCreatedby("1");
        makananService.save(makanan);
        return "redirect:/makanan";
    }

    @RequestMapping("/makanan/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") String id, DaoSuku suku, DaoMakanan makanan, ModelMap modelMap){
        Optional<DaoMakanan> daoMakanan = makananService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("makanan", daoMakanan );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());

        return "edit-makanan";
    }

    @RequestMapping("/makanan/delete/{id}")
    public String deleteMakanan(@PathVariable String id){
        makananService.delete(id);
        return "redirect:/makanan";
    }

}
