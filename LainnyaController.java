package supra.co.id.paraLainnyaFrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lainnya")
public class LainnyaController {

    @RequestMapping("/pemeliharaan")
    public String viewInputLainnya(){
        return "pages/lainnya/pemeliharaan";
    }

    @RequestMapping("/pemelblokir")
    public String viewInputBlokir(){
        return"pages/lainnya/pemelblokir";
    }
}