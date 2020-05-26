package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoSuku;
import com.jjarfi.github.ntt.Model.DaoTarian;
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
public class TarianController {
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


    @GetMapping("/tarian")
    public String getTarian(DaoTarian tarian, ModelMap modelMap) {
        modelMap.addAttribute("tabelTarian", tarianService.getALlTarian());
        modelMap.addAttribute("tarian", tarian);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "tarian";
    }

    @GetMapping("/tarian/add")
    public String addTarian(DaoTarian tarian, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("tarian", tarian);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        return "tambah-tarian";
    }

    @PostMapping("/tarian/save")
    public String getSave( DaoTarian tarian) {
        tarian.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        tarian.setCreatedby("1");
        tarianService.save(tarian);
        return "redirect:/tarian";
    }

    @RequestMapping("/tarian/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") String id, DaoSuku suku, ModelMap modelMap){
        Optional<DaoTarian> daoTarian = tarianService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("tarian", daoTarian );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());

        return "edit-tarian";
    }

    @RequestMapping("/tarian/delete/{id}")
    public String deleteTarian(@PathVariable String id){
        tarianService.delete(id);
        return "redirect:/tarian";
    }
}
