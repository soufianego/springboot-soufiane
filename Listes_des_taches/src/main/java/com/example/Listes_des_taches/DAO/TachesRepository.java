
package com.example.Listes_des_taches.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Listes_des_taches.Entities.TACHE;

public interface TachesRepository extends JpaRepository<TACHE,Long> {

	
}