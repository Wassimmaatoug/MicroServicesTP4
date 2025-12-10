package master.fss.tp5.controller;

import master.fss.tp5.model.Resultat;
import master.fss.tp5.repository.ResultatRepository;
import master.fss.tp5.service.CalculatriceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calcul")
public class CalculatriceController {

    private final CalculatriceService calculatriceService;
    private final ResultatRepository resultatRepository;

    public CalculatriceController(CalculatriceService calculatriceService,
                                  ResultatRepository resultatRepository) {
        this.calculatriceService = calculatriceService;
        this.resultatRepository = resultatRepository;
    }

    @GetMapping("/somme")
    public Double somme(@RequestParam Double a, @RequestParam Double b) {
        Double resultat = calculatriceService.addition(a, b);
        Resultat operation = new Resultat(a, b, "addition", resultat);
        resultatRepository.save(operation);
        return resultat;
    }

    @GetMapping("/resultats")
    public List<Resultat> getAllResultats() {
        return resultatRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "Service calculatrice actif !";
    }
}