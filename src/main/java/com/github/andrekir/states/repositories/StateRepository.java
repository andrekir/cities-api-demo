package com.github.andrekir.states.repositories;

import com.github.andrekir.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
