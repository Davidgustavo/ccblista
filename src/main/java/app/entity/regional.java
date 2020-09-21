package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiSearchable;


/**
 * Classe que representa a tabela REGIONAL
 * @generated
 */
@Entity
@Table(name = "\"REGIONAL\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"regional_nome" ,"regional_sede" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.regional")
public class regional implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "regional_nome", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_nome;

  /**
  * @generated
  */
  @Column(name = "regional_sede", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_sede;

  /**
  * @generated
  */
  @Column(name = "regional_cep", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_cep;

  /**
  * @generated
  */
  @Column(name = "regional_fonefixo", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_fonefixo;

  /**
  * @generated
  */
  @Column(name = "regional_fonecel", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_fonecel;

  /**
  * @generated
  */
  @Column(name = "regional_logradouro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_logradouro;

  /**
  * @generated
  */
  @Column(name = "regional_bairro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_bairro;

  /**
  * @generated
  */
  @Column(name = "regional_email", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String regional_email;

  /**
  * @generated
  */
  @Column(name = "regional_obs", nullable = true, unique = false, length=400, insertable=true, updatable=true)
  
  private java.lang.String regional_obs;

  /**
   * Construtor
   * @generated
   */
  public regional(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public regional setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém regional_nome
   * return regional_nome
   * @generated
   */
  
  public java.lang.String getRegional_nome(){
    return this.regional_nome;
  }

  /**
   * Define regional_nome
   * @param regional_nome regional_nome
   * @generated
   */
  public regional setRegional_nome(java.lang.String regional_nome){
    this.regional_nome = regional_nome;
    return this;
  }

  /**
   * Obtém regional_sede
   * return regional_sede
   * @generated
   */
  
  public java.lang.String getRegional_sede(){
    return this.regional_sede;
  }

  /**
   * Define regional_sede
   * @param regional_sede regional_sede
   * @generated
   */
  public regional setRegional_sede(java.lang.String regional_sede){
    this.regional_sede = regional_sede;
    return this;
  }

  /**
   * Obtém regional_cep
   * return regional_cep
   * @generated
   */
  
  public java.lang.String getRegional_cep(){
    return this.regional_cep;
  }

  /**
   * Define regional_cep
   * @param regional_cep regional_cep
   * @generated
   */
  public regional setRegional_cep(java.lang.String regional_cep){
    this.regional_cep = regional_cep;
    return this;
  }

  /**
   * Obtém regional_fonefixo
   * return regional_fonefixo
   * @generated
   */
  
  public java.lang.String getRegional_fonefixo(){
    return this.regional_fonefixo;
  }

  /**
   * Define regional_fonefixo
   * @param regional_fonefixo regional_fonefixo
   * @generated
   */
  public regional setRegional_fonefixo(java.lang.String regional_fonefixo){
    this.regional_fonefixo = regional_fonefixo;
    return this;
  }

  /**
   * Obtém regional_fonecel
   * return regional_fonecel
   * @generated
   */
  
  public java.lang.String getRegional_fonecel(){
    return this.regional_fonecel;
  }

  /**
   * Define regional_fonecel
   * @param regional_fonecel regional_fonecel
   * @generated
   */
  public regional setRegional_fonecel(java.lang.String regional_fonecel){
    this.regional_fonecel = regional_fonecel;
    return this;
  }

  /**
   * Obtém regional_logradouro
   * return regional_logradouro
   * @generated
   */
  
  public java.lang.String getRegional_logradouro(){
    return this.regional_logradouro;
  }

  /**
   * Define regional_logradouro
   * @param regional_logradouro regional_logradouro
   * @generated
   */
  public regional setRegional_logradouro(java.lang.String regional_logradouro){
    this.regional_logradouro = regional_logradouro;
    return this;
  }

  /**
   * Obtém regional_bairro
   * return regional_bairro
   * @generated
   */
  
  public java.lang.String getRegional_bairro(){
    return this.regional_bairro;
  }

  /**
   * Define regional_bairro
   * @param regional_bairro regional_bairro
   * @generated
   */
  public regional setRegional_bairro(java.lang.String regional_bairro){
    this.regional_bairro = regional_bairro;
    return this;
  }

  /**
   * Obtém regional_email
   * return regional_email
   * @generated
   */
  
  public java.lang.String getRegional_email(){
    return this.regional_email;
  }

  /**
   * Define regional_email
   * @param regional_email regional_email
   * @generated
   */
  public regional setRegional_email(java.lang.String regional_email){
    this.regional_email = regional_email;
    return this;
  }

  /**
   * Obtém regional_obs
   * return regional_obs
   * @generated
   */
  
  public java.lang.String getRegional_obs(){
    return this.regional_obs;
  }

  /**
   * Define regional_obs
   * @param regional_obs regional_obs
   * @generated
   */
  public regional setRegional_obs(java.lang.String regional_obs){
    this.regional_obs = regional_obs;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    regional object = (regional)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
