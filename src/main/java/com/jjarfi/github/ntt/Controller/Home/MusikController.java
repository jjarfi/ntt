package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoMusik;
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

@Controller
public class MusikController {
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

    @GetMapping("/musik")
    public String getMusik(DaoMusik musik, ModelMap modelMap) {
        modelMap.addAttribute("tabelMusik", musikService.getAllMusik());
        modelMap.addAttribute("musik", musik);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "musik";
    }

    @GetMapping("/musik/add")
    public String addMusik(DaoMusik musik, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("musik", musik);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "tambah-musik";
    }

    @PostMapping("/musik/save")
    public String getSave( DaoMusik musik) {
        musik.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        musik.setCreatedby("1");
        musikService.save(musik);
        return "redirect:/musik";
    }

    @RequestMapping("/musik/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") Long id, DaoSuku suku, ModelMap modelMap){
        DaoMusik daoMusik = musikService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("musik", daoMusik );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "edit-musik";
    }

    @RequestMapping("/musik/delete/{id}")
    public String deleteMusik(@PathVariable Long id){
        musikService.delete(id);
        return "redirect:/musik";
    }
}
