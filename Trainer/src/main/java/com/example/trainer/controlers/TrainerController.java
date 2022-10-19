package com.example.trainer.controlers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trainer.entities.Trainer;
import com.example.trainer.serviceinterfaces.ITrainerService;

import java.util.List;
@RestController
@RequestMapping("/trainer")
public class TrainerController {
    @Autowired
    private ITrainerService tService;

    @PostMapping
    public void registrar(@RequestBody Trainer t){
        tService.insert(t);
    }
    @GetMapping
    public List<Trainer>list(){
        return tService.list();
    }

}
