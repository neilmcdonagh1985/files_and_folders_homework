package com.example.fileservice.repositories;

import com.example.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
