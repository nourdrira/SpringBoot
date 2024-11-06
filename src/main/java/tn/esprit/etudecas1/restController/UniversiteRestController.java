package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Universite;
import tn.esprit.etudecas1.services.IUniversiteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UniversiteRestController {
    private final IUniversiteService iUniversiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return iUniversiteService.updateUniversite(universite);
    }

    @GetMapping("/getAllUniversites")
    public List<Universite> retrieveAllUniversites() {
        return iUniversiteService.retrieveAllUniversites();
    }

    @GetMapping("/findByIdU/{idU}")
    public Universite retrieveUniversiteById(@PathVariable long idU) {
        return iUniversiteService.retrieveUniversiteById(idU);
    }


    @PostMapping("/affecterFoyerAUniversite/{idF}/{idU}")
    public Universite affecterFoyerAUniversite(@PathVariable long idF, @PathVariable long idU ) {
        return iUniversiteService.affecterFoyerAUniversite(idF, idU);
    }
    // API pour désaffecter un foyer d'une université
    @PostMapping("/desaffecterFoyer")
    public Universite desaffecterFoyer(@RequestParam long idUniversite) {
        return iUniversiteService.desaffecterFoyerAUniversite(idUniversite);
    }



}
