package com.workintech.model.controller;

import com.workintech.model.entity.Actor;
import com.workintech.model.service.ActorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workintech/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;
    @GetMapping
    public Iterable<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @PutMapping("/{id}")
    public Actor updateActor(@PathVariable Long id, @RequestBody Actor actor) {
        return actorService.updateActor(id, actor);
    }
}
