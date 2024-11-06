package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Etudiant;
import tn.esprit.etudecas1.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiants")
public class EtudiantRestController {
    private final IEtudiantService iEtudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return iEtudiantService.addEtudiant(e);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return iEtudiantService.updateEtudiant(e);
    }

    @GetMapping("/getAllEtudiants")
    public List<Etudiant> retrieveAllEtudiant(){
        return iEtudiantService.retrieveAllEtudiant();
    }

    @GetMapping("/findByIdE/{idE}")
    public Etudiant retrieveById(@PathVariable long idE){
        return iEtudiantService.retrieveById(idE);
    }

    @DeleteMapping("/deleteById/{idE}")
    public void deleteEtudiant(@PathVariable long idE){
        iEtudiantService.deleteEtudiant(idE);
    }

}
