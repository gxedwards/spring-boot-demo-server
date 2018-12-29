package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 * Leverages Spring Data to do CRUD on the Beer Entity
 * 
 * @RepositoryRestResource creates a RestEndpoint
 */
@RepositoryRestResource
interface BeerRepository extends JpaRepository<Beer, Long> {
}