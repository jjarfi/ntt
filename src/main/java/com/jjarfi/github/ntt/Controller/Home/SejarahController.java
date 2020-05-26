package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoSejarah;
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
public class SejarahController {
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

    @GetMapping("/sejarah")
    public String getSejarah(DaoSejarah sejarah, ModelMap modelMap) {
        modelMap.addAttribute("tabelSejarah", sejarahService.getAllSejarah());
        modelMap.addAttribute("sejarah", sejarah);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "sejarah";
    }

    @GetMapping("/sejarah/add")
    public String addSejarah(DaoSejarah sejarah, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("sejarah", sejarah);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "tambah-sejarah";
    }

    @PostMapping("/sejarah/save")
    public String getSave(DaoSejarah sejarah) {
        sejarah.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        sejarah.setCreatedby("1");
        sejarahService.save(sejarah);
        return "redirect:/sejarah";
    }

    @RequestMapping("/sejarah/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") Long id, DaoSuku suku, ModelMap modelMap){
        DaoSejarah daoSejarah = sejarahService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("sejarah", daoSejarah );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "edit-sejarah";
    }
    @RequestMapping("/sejarah/delete/{id}")
    public String deleteSejarah(@PathVariable Long id){
        sejarahService.delete(id);
        return "redirect:/sejarah";
    }

}
