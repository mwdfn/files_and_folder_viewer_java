package com.files_and_folders.files_and_folders.controllers;

import com.files_and_folders.files_and_folders.models.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {
//    @Autowired
//    FileController fileController;
//
//    @GetMapping(value = "/files")
//    public ResponseEntity<List<File>> getAllFiles(){
//        return new ResponseEntity<>(fileController.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/files/{id}")
//    public Optional<File> getFile(@PathVariable Long id){
//        return fileController.findById(id);
//    }
//
//    @PostMapping(value = "/files")
//    public ResponseEntity<File> postFile(@RequestBody File file){
//        fileController.save(file);
//        return new ResponseEntity<>(file, HttpStatus.CREATED);
//    }
}
