package com.javaCDG.CDGp.services;
import com.javaCDG.CDGp.entities.Role;
import com.javaCDG.CDGp.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleService {
    private final RoleRepo roleRepository;

    @Autowired
    public RoleService(RoleRepo roleRepository) {

        this.roleRepository = roleRepository;
    }

    //+/-
    public Optional<Role> findRoleByEmail(String email) {

        return null;
//        return roleRepository.findByUser_Email()(email);
    }

    public Role saveRole(Role role) {

        return roleRepository.save(role);
    }

    public void deleteRole(Long id) {

        roleRepository.deleteById(id);
    }

}
