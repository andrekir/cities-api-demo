package com.github.andrekir.countries.repositories;

import com.github.andrekir.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
