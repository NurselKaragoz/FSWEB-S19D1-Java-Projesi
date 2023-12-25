package com.workintech.model.service;

import com.workintech.model.entity.Actor;

public interface ActorService {
    Iterable<Actor> getAllActors();
    Actor getActorById(Long id);
    Actor saveActor(Actor actor);
    Actor updateActor(Long id, Actor actor);
    void deleteActor(Long id);
}
