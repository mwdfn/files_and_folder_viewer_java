package com.files_and_folders.files_and_folders;

import com.files_and_folders.files_and_folders.models.File;
import com.files_and_folders.files_and_folders.models.Folder;
import com.files_and_folders.files_and_folders.models.Person;
import com.files_and_folders.files_and_folders.repositories.FileRepository;
import com.files_and_folders.files_and_folders.repositories.FolderRepository;
import com.files_and_folders.files_and_folders.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	PersonRepository personRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePersonAndFolderAndFile(){
		Person person1 = new Person("Jim");
		personRepository.save(person1);

		Folder folder1 = new Folder("Documents", person1);
		folderRepository.save(folder1);

		File file1 = new File("Long Essay",".docx",31,folder1);
		fileRepository.save(file1);
	}

}
