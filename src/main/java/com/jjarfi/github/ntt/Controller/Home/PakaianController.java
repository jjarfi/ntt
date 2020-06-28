package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoPakaian;
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
public class PakaianController {

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

    @GetMapping("/pakaian")
    public String getPakaian(DaoPakaian pakaian, ModelMap modelMap) {
        modelMap.addAttribute("tabelPakaian", pakaianService.getAllPakaian());
        modelMap.addAttribute("pakaian", pakaian);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "pakaian";
    }

    @GetMapping("/pakaian/add")
    public String addPakaian(DaoPakaian pakaian, DaoSuku suku, ModelMap modelMap) {
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("pakaian", pakaian);
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "tambah-pakaian";
    }

    @PostMapping("/pakaian/save")
    public String getSave(DaoPakaian pakaian) {
        pakaian.setCreatedate(Timestamp.valueOf(LocalDateTime.now()));
        pakaian.setCreatedby("1");
        pakaianService.save(pakaian);
        return "redirect:/pakaian";
    }

    @RequestMapping("/pakaian/edit/{id}")
    public String getShowEdit(@PathVariable(name = "id") String id, DaoSuku suku, ModelMap modelMap){
        Optional<DaoPakaian> daoPakaian = pakaianService.getId(id);
        modelMap.addAttribute("selectSuku", sukuService.getAllSuku());
        modelMap.addAttribute("suku", suku);
        modelMap.addAttribute("pakaian", daoPakaian );
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());

        return "edit-pakaian";
    }

    @RequestMapping("/pakaian/delete/{id}")
    public String deletePakaian(@PathVariable String id){
        pakaianService.delete(id);
        return "redirect:/pakaian";
    }

}
