package com.gabigramires.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gabigramires.apirest.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
