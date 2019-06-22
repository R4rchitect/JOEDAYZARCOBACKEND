package pe.com.extranetorchestrator.domain.mifarma.arco.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import pe.com.extranetorchestrator.domain.mifarma.arco.service.UploadFileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadFileServiceImpl implements UploadFileService {

   // private String upload_folder = ".\\src\\main\\resources\\files\\";

       public void saveFile(MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            byte[] bytes = file.getBytes();
            Path path = Paths.get("" + file.getOriginalFilename());
            Files.write(path,bytes);
        }
    }
}
