package com.files_and_folders.files_and_folders.components;

import com.files_and_folders.files_and_folders.models.File;
import com.files_and_folders.files_and_folders.models.Folder;
import com.files_and_folders.files_and_folders.models.Person;
import com.files_and_folders.files_and_folders.repositories.FileRepository;
import com.files_and_folders.files_and_folders.repositories.FolderRepository;
import com.files_and_folders.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Person person1 = new Person("Jim");
        personRepository.save(person1);

        Person person2 = new Person("Tim");
        personRepository.save(person2);

        Person person3 = new Person("Jan");
        personRepository.save(person3);

        Person person4 = new Person("Liz");
        personRepository.save(person4);

        Folder folder1 = new Folder("Documents", person1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Homework", person2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Paperwork", person3);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Work", person4);
        folderRepository.save(folder4);

        File file1 = new File("Long Essay", ".docx", 31, folder1);
        fileRepository.save(file1);

        File file2 = new File("Reflective Essay", ".docx", 11, folder2);
        fileRepository.save(file2);

        File file3 = new File("Form", ".pdf", 6, folder3);
        fileRepository.save(file3);

        File file4 = new File("Purchases", ".csv", 7, folder4);
        fileRepository.save(file4);

    }

}
