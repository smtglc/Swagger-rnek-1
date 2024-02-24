package com.KayKayProjesi.Profil.repository;

import com.KayKayProjesi.Profil.models.ERole;
import com.KayKayProjesi.Profil.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
