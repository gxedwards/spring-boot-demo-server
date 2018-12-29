package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
/**
 * Leverages Spring Data to do CRUD on the Beer Entity
 * 
 * @RepositoryRestResource creates a RestEndpoint
 */
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8100","http://localhost:8080"})
@RepositoryRestResource
interface BeerRepository extends JpaRepository<Beer, Long> {
}