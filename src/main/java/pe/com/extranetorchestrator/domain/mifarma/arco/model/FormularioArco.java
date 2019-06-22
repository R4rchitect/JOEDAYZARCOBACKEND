package pe.com.extranetorchestrator.domain.mifarma.arco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "wp_jyc_form")
public class FormularioArco implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Date datetime;
	private String name;
	private String lastname;
	private String type_doc;
	private String number_doc;
	private String email;
	private String name_rep;
	private String lastname_rep;
	private String type_doc_rep;
	private String number_doc_rep;
	private String tipo_solicitud;
	private String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getType_doc() {
		return type_doc;
	}
	public void setType_doc(String type_doc) {
		this.type_doc = type_doc;
	}
	public String getNumber_doc() {
		return number_doc;
	}
	public void setNumber_doc(String number_doc) {
		this.number_doc = number_doc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName_rep() {
		return name_rep;
	}
	public void setName_rep(String name_rep) {
		this.name_rep = name_rep;
	}
	public String getLastname_rep() {
		return lastname_rep;
	}
	public void setLastname_rep(String lastname_rep) {
		this.lastname_rep = lastname_rep;
	}
	public String getType_doc_rep() {
		return type_doc_rep;
	}
	public void setType_doc_rep(String type_doc_rep) {
		this.type_doc_rep = type_doc_rep;
	}
	public String getNumber_doc_rep() {
		return number_doc_rep;
	}
	public void setNumber_doc_rep(String number_doc_rep) {
		this.number_doc_rep = number_doc_rep;
	}
	public String getTipo_solicitud() {
		return tipo_solicitud;
	}
	public void setTipo_solicitud(String tipo_solicitud) {
		this.tipo_solicitud = tipo_solicitud;
	}

	
}