package com.springexample2.context.producer;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

@Service
public class FileMessageProducer implements MessageProducer{

    @Override
    public String getMessage() {
        Path path = getPath();
        try {
            return String.join(" ",Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Path getPath(){
        System.out.println("Write name of file to read");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        return Path.of(fileName);
    }
}
