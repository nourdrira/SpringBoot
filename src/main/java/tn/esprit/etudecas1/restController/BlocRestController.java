package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Bloc;
import tn.esprit.etudecas1.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {

    private final IBlocService iBlocService;

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return iBlocService.addBloc(bloc);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }

    @GetMapping("/getAllBlocs")
    public List<Bloc> retrieveAllBlocs() {
        return iBlocService.retrieveBlocs();
    }

    @GetMapping("/findByIdB/{idB}")
    public Bloc retrieveById(@PathVariable long idB) {
        return iBlocService.retrieveBloc(idB);
    }


}
