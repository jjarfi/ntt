package com.jjarfi.github.ntt.Controller.Home;


import com.jjarfi.github.ntt.Model.DaoSuku;
import com.jjarfi.github.ntt.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Controller
@Transactional
public class HomeController {

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


    @GetMapping("/home")
    public String getDashboard(DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("tabelSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "beranda";
    }

    @GetMapping("/home/add")
    public String addSuku(DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "tambah-suku";
    }

    @PostMapping("/home/save")
    public String getSave(DaoSuku suku) {
        suku.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        suku.setCreatedby("1");
        sukuService.save(suku);
        return "redirect:/home";
    }

    @RequestMapping("/home/suku/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") String id, ModelMap modelMap){
        Optional<DaoSuku> daoSuku = sukuService.getId(id);
        modelMap.addAttribute("suku", daoSuku);
        return "edit-suku";
    }

    @RequestMapping("/home/suku/delete/{id}")
    public String deleteSuku(@PathVariable String id){
        sukuService.delete(id);
        return "redirect:/home";
    }
}
