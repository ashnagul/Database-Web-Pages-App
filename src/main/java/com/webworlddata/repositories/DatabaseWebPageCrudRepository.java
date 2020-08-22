package com.webworlddata.repositories;

import com.webworlddata.entities.DatabaseWebPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseWebPageCrudRepository extends JpaRepository<DatabaseWebPage, Long> {
}
