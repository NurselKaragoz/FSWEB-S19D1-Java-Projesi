package com.workintech.model.service;

import com.workintech.model.entity.Actor;
import com.workintech.model.repository.ActorRepository;
import com.workintech.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService{
    @Autowired
    private ActorRepository actorRepository;
    @Override
    public Iterable<Actor> getAllActors() {
        return null;
    }

    @Override
    public Actor getActorById(Long id) {
        return null;
    }

    @Override
    public Actor saveActor(Actor actor) {
        return null;
    }

    @Override
    public Actor updateActor(Long id, Actor actor) {
        return null;
    }

    @Override
    public void deleteActor(Long id) {

    }
}
