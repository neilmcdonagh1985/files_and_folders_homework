package com.example.fileservice.components;

import com.example.fileservice.models.File;
import com.example.fileservice.models.Folder;
import com.example.fileservice.models.User;
import com.example.fileservice.repositories.FileRepository;
import com.example.fileservice.repositories.FolderRepository;
import com.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User neil = new User("Neil");
        userRepository.save(neil);

        User jim = new User("Jim");
        userRepository.save(jim);

        User ross = new User("Ross");
        userRepository.save(ross);

        Folder policies = new Folder("policies", ross);
        folderRepository.save(policies);

        Folder archives = new Folder("Archives", jim);
        folderRepository.save(archives);

        File java = new File("java", ".java",100, policies);
        fileRepository.save(java);

        File ruby = new File("ruby", ".rb", 150, archives);
        fileRepository.save(ruby);
    }

}
