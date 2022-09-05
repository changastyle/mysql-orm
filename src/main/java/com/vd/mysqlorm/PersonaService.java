package com.vd.mysqlorm;

import com.vd.mysqlorm.repo.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping(value = "persona")
public class PersonaService
{
    @Autowired
    PersonaRepo personaRepo;

    @GetMapping(value = "/")
    public List<Persona> find()
    {
        return personaRepo.findAll();
    }
    @PostMapping(value = "save")
    public Persona save(@RequestBody Persona personaNew)
    {
        return personaRepo.save(personaNew);
    }
}
