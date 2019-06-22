package pe.com.extranetorchestrator.domain.mifarma.arco.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {

    public void saveFile(MultipartFile file) throws IOException;
    
}
