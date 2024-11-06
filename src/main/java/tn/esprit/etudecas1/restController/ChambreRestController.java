package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Chambre;
import tn.esprit.etudecas1.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor

public class ChambreRestController {

    private final IChambreService iChambreService;

    // Ajouter une nouvelle chambre
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }

    // Mettre à jour une chambre existante
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return iChambreService.updateChambre(chambre);
    }

    // Récupérer toutes les chambres
    @GetMapping("/getAllChambres")
    public List<Chambre> retrieveAllChambres() {
        return iChambreService.retrieveAllChambres();
    }

    // Récupérer une chambre par son ID
    @GetMapping("/findById/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return iChambreService.retrieveChambre(idChambre);
    }
}
