package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoRumah;
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
public class RumahController {
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

    @GetMapping("/rumah")
    public String getRumah(DaoRumah rumah, ModelMap modelMap) {
        modelMap.addAttribute("tabelRumah", rumahService.getAllRumah());
        modelMap.addAttribute("rumah", rumah);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "rumah";
    }

    @GetMapping("/rumah/add")
    public String addRumah(DaoRumah rumah, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("rumah", rumah);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "tambah-rumah";
    }

    @PostMapping("/rumah/save")
    public String getSave(DaoRumah rumah) {
        rumah.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        rumah.setCreatedby("1");
        rumahService.save(rumah);
        return "redirect:/rumah";
    }

    @RequestMapping("/rumah/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") String id, DaoSuku suku, ModelMap modelMap){
        Optional<DaoRumah> daoRumah = rumahService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("rumah", daoRumah );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "edit-rumah";
    }

    @RequestMapping("/rumah/delete/{id}")
    public String deleteRumah(@PathVariable String id){
        rumahService.delete(id);
        return "redirect:/rumah";
    }
}
