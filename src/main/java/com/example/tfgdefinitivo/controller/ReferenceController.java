package com.example.tfgdefinitivo.controller;

import com.example.tfgdefinitivo.dao.ReferenceDao;
import com.example.tfgdefinitivo.model.Reference;
import org.jbibtex.ParseException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@RestController
@RequestMapping("/references")
public class ReferenceController {


    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public static List<Reference> getReferences(){ return ReferenceDao.getAllReferences(); }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public static void addReference(String path, String nameDL, Statement s)
            throws ParseException, SQLException, IOException {
        ReferenceDao.importar(path, nameDL, s);
    }

    @RequestMapping(value = "/createTables")
    public void createTables(){
        ReferenceDao.create();
    }
    @RequestMapping(value = "/deleteTables")
    public void deleteTables(){
        ReferenceDao.delete();
    }

    //@PostMapping(value = "/references", produces = MediaType.APPLICATION_JSON_VALUE)
 //   HTTP POST request, used to create a new resource.
    //public String postReference(@RequestParam String name) {}


}