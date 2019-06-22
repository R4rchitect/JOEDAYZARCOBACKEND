package pe.com.extranetorchestrator.domain.mifarma.arco.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "wp_jyc_form_files")
public class ArchivoAdjunto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idfile;
	private String filename;
	private String filetype;
	private Long idformulario;
	
	public ArchivoAdjunto() {
		
	}

	public Long getIdfile() {
		return idfile;
	}

	public void setIdfile(Long idfile) {
		this.idfile = idfile;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public Long getIdformulario() {
		return idformulario;
	}

	public void setIdformulario(Long idformulario) {
		this.idformulario = idformulario;
	}


	
}