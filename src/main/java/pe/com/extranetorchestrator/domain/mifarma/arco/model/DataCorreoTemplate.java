package pe.com.extranetorchestrator.domain.mifarma.arco.model;

import java.util.Date;

public class DataCorreoTemplate {

    private String fecha;
	private String nroSolicitud;
	private String titu_nombres;
	private String titu_apellidos;
	private String titu_tipodoc;
	private String titu_numdoc;
	private String titu_email;
	private String titu_domicilio;
	
	private String repre_nombres;
    private String repre_apellidos;
    private String repre_tipodoc;
    private String repre_numdoc;
    
    private String tipoacceso;
    private String tiporectificacion;
    private String tipocancelacion;
    private String tipoposicion;
    
    private String textArea;
    
    public DataCorreoTemplate() {
		// TODO Auto-generated constructor stub
	}
    

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getNroSolicitud() {
		return nroSolicitud;
	}
	public void setNroSolicitud(String nroSolicitud) {
		this.nroSolicitud = nroSolicitud;
	}
	public String getTitu_nombres() {
		return titu_nombres;
	}
	public void setTitu_nombres(String titu_nombres) {
		this.titu_nombres = titu_nombres;
	}
	public String getTitu_apellidos() {
		return titu_apellidos;
	}
	public void setTitu_apellidos(String titu_apellidos) {
		this.titu_apellidos = titu_apellidos;
	}
	public String getTitu_tipodoc() {
		return titu_tipodoc;
	}
	public void setTitu_tipodoc(String titu_tipodoc) {
		this.titu_tipodoc = titu_tipodoc;
	}
	public String getTitu_numdoc() {
		return titu_numdoc;
	}
	public void setTitu_numdoc(String titu_numdoc) {
		this.titu_numdoc = titu_numdoc;
	}
	public String getTitu_email() {
		return titu_email;
	}
	public void setTitu_email(String titu_email) {
		this.titu_email = titu_email;
	}
	public String getTitu_domicilio() {
		return titu_domicilio;
	}
	public void setTitu_domicilio(String titu_domicilio) {
		this.titu_domicilio = titu_domicilio;
	}
	public String getRepre_nombres() {
		return repre_nombres;
	}
	public void setRepre_nombres(String repre_nombres) {
		this.repre_nombres = repre_nombres;
	}
	public String getRepre_apellidos() {
		return repre_apellidos;
	}
	public void setRepre_apellidos(String repre_apellidos) {
		this.repre_apellidos = repre_apellidos;
	}
	public String getRepre_tipodoc() {
		return repre_tipodoc;
	}
	public void setRepre_tipodoc(String repre_tipodoc) {
		this.repre_tipodoc = repre_tipodoc;
	}
	public String getRepre_numdoc() {
		return repre_numdoc;
	}
	public void setRepre_numdoc(String repre_numdoc) {
		this.repre_numdoc = repre_numdoc;
	}
	public String getTipoacceso() {
		return tipoacceso;
	}
	public void setTipoacceso(String tipoacceso) {
		this.tipoacceso = tipoacceso;
	}
	public String getTiporectificacion() {
		return tiporectificacion;
	}
	public void setTiporectificacion(String tiporectificacion) {
		this.tiporectificacion = tiporectificacion;
	}
	public String getTipocancelacion() {
		return tipocancelacion;
	}
	public void setTipocancelacion(String tipocancelacion) {
		this.tipocancelacion = tipocancelacion;
	}
	public String getTipoposicion() {
		return tipoposicion;
	}
	public void setTipoposicion(String tipoposicion) {
		this.tipoposicion = tipoposicion;
	}


	public String getTextArea() {
		return textArea;
	}


	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
    
	
}
