package com.workintech.model.service;

import com.workintech.model.entity.Actor;
import com.workintech.model.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService{
    @Autowired
    private ActorRepository actorRepository;
    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    public Actor getActorById(Long id) {
      Optional<Actor> findActor= actorRepository.findById(id);
      if(findActor.isPresent()){
          return findActor.get();
      }
      throw new RuntimeException();
    }

    @Override
    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor updateActor(Long id, Actor actor) {
        return null;
    }



    @Override
    public void deleteActor(Actor actor) {
        actorRepository.delete(actor);

    }
}
