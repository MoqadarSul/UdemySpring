package springpetclinic.Services;

import springpetclinic.model.Pet;
import springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
