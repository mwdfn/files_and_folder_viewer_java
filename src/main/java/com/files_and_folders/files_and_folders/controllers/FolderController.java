package com.files_and_folders.files_and_folders.controllers;

import com.files_and_folders.files_and_folders.models.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {
//    @Autowired
//    FolderController folderController;
//
//    @GetMapping(value = "/folders")
//    public ResponseEntity<List<Folder>> getAllFolders(){
//        return new ResponseEntity<>(folderController.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/folders/{id}")
//    public Optional<Folder> getFolder(@PathVariable Long id){
//        return folderController.findById(id);
//    }
//
//    @PostMapping(value = "/folders")
//    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
//        folderController.save(folder);
//        return new ResponseEntity<>(folder, HttpStatus.CREATED);
//    }

}
