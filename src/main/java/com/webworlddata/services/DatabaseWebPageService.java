package com.webworlddata.services;

import com.webworlddata.entities.DatabaseWebPage;
import com.webworlddata.repositories.DatabaseWebPageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DatabaseWebPageService {

    @Autowired
    private DatabaseWebPageCrudRepository databaseWebPageCrud;

    public Iterable<DatabaseWebPage> getAllWebPages(){
        return databaseWebPageCrud.findAll();
    }

    public Optional<DatabaseWebPage> getWebPagesById(long Id){
        return databaseWebPageCrud.findById(Id);
    }

    public void deleteById(long id) {
        databaseWebPageCrud.deleteById(id);
    }

    public void updateDatabaseWebPage(DatabaseWebPage databaseWebPage) {
        databaseWebPageCrud.save(databaseWebPage);
    }

    public void saveDatatabaseWebPage(DatabaseWebPage databaseWebPage) {
        databaseWebPageCrud.save(databaseWebPage);
    }
}
