package pe.com.extranetorchestrator.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pe.com.extranetorchestrator.domain.mifarma.arco.model.ArchivoAdjunto;
import pe.com.extranetorchestrator.domain.mifarma.arco.model.FormularioArco;
import pe.com.extranetorchestrator.domain.mifarma.arco.repository.ArchivoAdjuntoRepository;
import pe.com.extranetorchestrator.domain.mifarma.arco.repository.FormularioArcoRepository;
import pe.com.extranetorchestrator.domain.mifarma.arco.service.UploadFileService;

@Controller
@RequestMapping(value = "/inkafarma/arco")
public class ArcoController {

  @Autowired
  private UploadFileService uploadFileService;
  
  @Autowired
  private FormularioArcoRepository formularioArcoRepository;
  
  @Autowired
  private ArchivoAdjuntoRepository archivoAdjuntoRepository;
  
  @PostMapping("/insertform")
  public ResponseEntity<String> insertform(@RequestParam("titu_archivo") MultipartFile titu_archivo,
		  								   @RequestParam("titu_nombre") String titu_nombre,
		  								   @RequestParam("titu_apellidos") String titu_apellidos,
			  							   @RequestParam("titu_domicilio") String titu_domicilio,
			  							   @RequestParam("titu_email") String titu_email,
			  							   @RequestParam("titu_numdoc") String titu_numdoc,
			  							   @RequestParam("titu_tipdoc") String titu_tipdoc,
			  							   @RequestParam("titu_tipoSolicitud") String titu_tipoSolicitud,
			  							   @RequestParam("checkedRepre") String checkedRepre,
			  							   @RequestParam("repre_nombres") String repre_nombres,
				  						   @RequestParam("repre_apellidos") String repre_apellidos,
			  							   @RequestParam("repre_tipdoc") String repre_tipdoc,
			  							   @RequestParam("repre_numdoc") String repre_numdoc,
			  							   @RequestParam(value="repre_archivoAdjunto", required=false) MultipartFile repre_archivoAdjunto,
			  							   @RequestParam(value="repre_archivoAcrediteAdjunto", required=false) MultipartFile repre_archivoAcrediteAdjunto,
			  							   @RequestParam(value="adicional_text", required=false) String adicional_text,
			  							   @RequestParam(value="adicional_archivoAdjunto", required=false) MultipartFile adicional_archivoAdjunto) {
	  
	String message = "";
	try {
		
        Long max = formularioArcoRepository.getMaxId()+1;
        
		List<File> lstFiles = new ArrayList<File>();
		lstFiles.add(convert(titu_archivo));
        
        FormularioArco formulario = new FormularioArco();
        formulario.setId(max);
        formulario.setName(titu_nombre);
        formulario.setLastname(titu_apellidos);
        formulario.setEmail(titu_email);
        formulario.setDatetime(new Date());
        formulario.setNumber_doc(titu_numdoc);
        formulario.setType_doc(titu_tipdoc);
        formulario.setAddress(titu_domicilio);
        formulario.setTipo_solicitud(titu_tipoSolicitud);
        
        ArchivoAdjunto archivo1 = new ArchivoAdjunto();
        archivo1.setFilename(titu_archivo.getOriginalFilename());
        archivo1.setFiletype(titu_archivo.getOriginalFilename().substring(titu_archivo.getOriginalFilename().lastIndexOf(".")+1));
        archivo1.setIdformulario(max);
        
        if(checkedRepre.equals("true")){
        formulario.setName_rep(repre_nombres);
        formulario.setLastname_rep(repre_apellidos);
        formulario.setNumber_doc_rep(repre_numdoc);
        formulario.setType_doc_rep(repre_tipdoc);
        
        ArchivoAdjunto archivo2 = new ArchivoAdjunto();
        archivo2.setFilename(repre_archivoAdjunto.getOriginalFilename());
        archivo2.setFiletype(repre_archivoAdjunto.getOriginalFilename().substring(repre_archivoAdjunto.getOriginalFilename().lastIndexOf(".")+1));
        archivo2.setIdformulario(max);
        
        ArchivoAdjunto archivo3 = new ArchivoAdjunto();
        archivo3.setFilename(repre_archivoAcrediteAdjunto.getOriginalFilename());
        archivo3.setFiletype(repre_archivoAcrediteAdjunto.getOriginalFilename().substring(repre_archivoAcrediteAdjunto.getOriginalFilename().lastIndexOf(".")+1));
        archivo3.setIdformulario(max);
        lstFiles.add(convert(repre_archivoAdjunto));
        lstFiles.add(convert(repre_archivoAcrediteAdjunto));
        archivoAdjuntoRepository.save(archivo2);
        archivoAdjuntoRepository.save(archivo3);
        }
        
        archivoAdjuntoRepository.save(archivo1);
        formularioArcoRepository.save(formulario);
        if(adicional_archivoAdjunto!=null) {
        lstFiles.add(convert(adicional_archivoAdjunto));	
        }
        
		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		message = "You successfully uploaded " + titu_archivo.getOriginalFilename() + "!";
		
		return ResponseEntity.status(HttpStatus.OK).body(message);
		
	} catch (Exception e) {
		System.out.println("Exception: Controller1 "+ e);
		message = "FAIL to upload " + titu_archivo.getOriginalFilename() + "!";
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
	}
  }
  
  public File convert(MultipartFile file) throws IOException
  {    
      File convFile = new File(file.getOriginalFilename());
      convFile.createNewFile(); 
      FileOutputStream fos = new FileOutputStream(convFile); 
      fos.write(file.getBytes());
      fos.close(); 
      return convFile;
  }
  
  
  @ResponseBody
  @GetMapping("/hi")
  public String hi() {

	return "Hi Farmacias";
	
  }
  
}
