package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Etudiant;
import tn.esprit.etudecas1.entities.Foyer;
import tn.esprit.etudecas1.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")

public class FoyerRestController {
    private IFoyerService iFoyerService;

@PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer){
    return iFoyerService.addFoyer(foyer);
}

@PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer){
    return iFoyerService.updateFoyer(foyer);
}

@GetMapping("/getAllF")
public List<Foyer> retriveAllFoyer(){
    return iFoyerService.retrieveAllFoyer();
}

@GetMapping("/findByIdF/{IdF}")
public Foyer retriveFById(@PathVariable long idF){
    return iFoyerService.retrieveFById(idF);
}

@GetMapping("/deleteById/{IdF}")
    public void deleteFoyer(@PathVariable long idF){
    iFoyerService.deleteFoyer(idF);
}


}
