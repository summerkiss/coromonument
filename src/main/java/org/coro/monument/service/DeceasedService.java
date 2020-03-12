package org.coro.monument.service;

import org.coro.monument.model.Deceased;
import org.coro.monument.repository.DeceasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeceasedService {
    @Autowired
    DeceasedRepository deceasedRepository;

    @PostMapping("/save")
    public Deceased save(@RequestBody Deceased newDeceased){
        return deceasedRepository.save(newDeceased).block();
    }
}
