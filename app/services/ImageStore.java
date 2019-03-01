package services;

import java.io.File;
import java.nio.file.Path;

public interface ImageStore {

    String save(Path source);
    File getImageById(String id);
    boolean deleteImageById(String id);
}
