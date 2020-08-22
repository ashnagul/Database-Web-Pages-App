package com.webworlddata.controllers;

import com.webworlddata.entities.DatabaseWebPage;
import com.webworlddata.services.DatabaseWebPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class DatabaseWebPageController {

    @Autowired
    private DatabaseWebPageService databaseWebPageService;

    @GetMapping("/webpages")
    public Iterable<DatabaseWebPage> getAllWebPages(){
        return databaseWebPageService.getAllWebPages();
    }

    @GetMapping("/webpages/{id}")
    public Optional<DatabaseWebPage> getWebPageById(@PathVariable("id") long id) { return databaseWebPageService.getWebPagesById(id); }

    @DeleteMapping("/webpages/{id}")
    public void deleteById(@PathVariable("id") long id) { databaseWebPageService.deleteById(id); }

    @PostMapping("/webpages")
    ResponseEntity<String> saveDatabaseWebpage(@Valid @RequestBody DatabaseWebPage databaseWebPage) {
        databaseWebPageService.saveDatatabaseWebPage(databaseWebPage);
        return ResponseEntity.ok("Valid");
    }

    @PutMapping("webpages/{id}")
    ResponseEntity<String> updateDatabaseWebPage(@Valid @RequestBody DatabaseWebPage databaseWebPage, @PathVariable long id) {
        if (databaseWebPage.getId() == id) {
            databaseWebPageService.saveDatatabaseWebPage(databaseWebPage);
            return ResponseEntity.ok("Valid");
        }
        return ResponseEntity.ok("Didn't find Id");
    }
}
