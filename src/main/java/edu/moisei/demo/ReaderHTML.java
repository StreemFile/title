package edu.moisei.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 * index.html.ReaderHTML
 *
 * @Autor: vovamv
 * @DateTime: 11.02.2021|11:47
 * @Version ReaderHTML: 1.0
 */

public class ReaderHTML {
    public ReaderHTML() {
    }
    public static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
