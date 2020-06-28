package com.jjarfi.github.ntt.Controller.Home;

import com.jjarfi.github.ntt.Model.DaoAdmin;
import com.jjarfi.github.ntt.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class AdminSettingController {

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

    @GetMapping("/admin/profil")
    public String getDashboard(DaoAdmin admin, ModelMap modelMap) {
        modelMap.addAttribute("dataAdmin", adminService.getAdmin());
        modelMap.addAttribute("admin", admin);
//
//        modelMap.addAttribute("adminFullname", adminService.findByNama(admin.getNama()));
//        modelMap.addAttribute("admin", admin);
//
        modelMap.addAttribute("jumlahSuku", sukuService.getCount());
        modelMap.addAttribute("jumlahSejarah", sejarahService.getCount());
        modelMap.addAttribute("jumlahPakaian", pakaianService.getCount());
        modelMap.addAttribute("jumlahRumah", rumahService.getCount());
        modelMap.addAttribute("jumlahMakanan", makananService.getCount());
        modelMap.addAttribute("jumlahMusik", musikService.getCount());
        modelMap.addAttribute("jumlahTarian", tarianService.getCount());
        return "profil";
    }

    @RequestMapping("/home/admin/edit/{id}")
    public ModelAndView getShowEdit(@PathVariable(name = "id") String id) {
        ModelAndView mv = new ModelAndView("profil");
        Optional<DaoAdmin> daoAdmin = adminService.getId(id);
        mv.addObject("admin", daoAdmin);
        return mv;
    }
}
