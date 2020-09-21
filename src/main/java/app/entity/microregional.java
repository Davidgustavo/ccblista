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
 * Classe que representa a tabela MICROREGIONAL
 * @generated
 */
@Entity
@Table(name = "\"MICROREGIONAL\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"microregional_nome" ,"microregional_sede" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.microregional")
public class microregional implements Serializable {

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
  @Column(name = "microregional_nome", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_nome;

  /**
  * @generated
  */
  @Column(name = "microregional_sede", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_sede;

  /**
  * @generated
  */
  @Column(name = "microregionao_cep", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregionao_cep;

  /**
  * @generated
  */
  @Column(name = "microregional_fonefixo", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_fonefixo;

  /**
  * @generated
  */
  @Column(name = "microregional_fonecel", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_fonecel;

  /**
  * @generated
  */
  @Column(name = "microregional_logradouro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_logradouro;

  /**
  * @generated
  */
  @Column(name = "microregional_bairro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_bairro;

  /**
  * @generated
  */
  @Column(name = "microregional_email", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String microregional_email;

  /**
  * @generated
  */
  @Column(name = "microregional_obs", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  
  private java.lang.String microregional_obs;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_regional", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private regional regional;

  /**
   * Construtor
   * @generated
   */
  public microregional(){
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
  public microregional setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém microregional_nome
   * return microregional_nome
   * @generated
   */
  
  public java.lang.String getMicroregional_nome(){
    return this.microregional_nome;
  }

  /**
   * Define microregional_nome
   * @param microregional_nome microregional_nome
   * @generated
   */
  public microregional setMicroregional_nome(java.lang.String microregional_nome){
    this.microregional_nome = microregional_nome;
    return this;
  }

  /**
   * Obtém microregional_sede
   * return microregional_sede
   * @generated
   */
  
  public java.lang.String getMicroregional_sede(){
    return this.microregional_sede;
  }

  /**
   * Define microregional_sede
   * @param microregional_sede microregional_sede
   * @generated
   */
  public microregional setMicroregional_sede(java.lang.String microregional_sede){
    this.microregional_sede = microregional_sede;
    return this;
  }

  /**
   * Obtém microregionao_cep
   * return microregionao_cep
   * @generated
   */
  
  public java.lang.String getMicroregionao_cep(){
    return this.microregionao_cep;
  }

  /**
   * Define microregionao_cep
   * @param microregionao_cep microregionao_cep
   * @generated
   */
  public microregional setMicroregionao_cep(java.lang.String microregionao_cep){
    this.microregionao_cep = microregionao_cep;
    return this;
  }

  /**
   * Obtém microregional_fonefixo
   * return microregional_fonefixo
   * @generated
   */
  
  public java.lang.String getMicroregional_fonefixo(){
    return this.microregional_fonefixo;
  }

  /**
   * Define microregional_fonefixo
   * @param microregional_fonefixo microregional_fonefixo
   * @generated
   */
  public microregional setMicroregional_fonefixo(java.lang.String microregional_fonefixo){
    this.microregional_fonefixo = microregional_fonefixo;
    return this;
  }

  /**
   * Obtém microregional_fonecel
   * return microregional_fonecel
   * @generated
   */
  
  public java.lang.String getMicroregional_fonecel(){
    return this.microregional_fonecel;
  }

  /**
   * Define microregional_fonecel
   * @param microregional_fonecel microregional_fonecel
   * @generated
   */
  public microregional setMicroregional_fonecel(java.lang.String microregional_fonecel){
    this.microregional_fonecel = microregional_fonecel;
    return this;
  }

  /**
   * Obtém microregional_logradouro
   * return microregional_logradouro
   * @generated
   */
  
  public java.lang.String getMicroregional_logradouro(){
    return this.microregional_logradouro;
  }

  /**
   * Define microregional_logradouro
   * @param microregional_logradouro microregional_logradouro
   * @generated
   */
  public microregional setMicroregional_logradouro(java.lang.String microregional_logradouro){
    this.microregional_logradouro = microregional_logradouro;
    return this;
  }

  /**
   * Obtém microregional_bairro
   * return microregional_bairro
   * @generated
   */
  
  public java.lang.String getMicroregional_bairro(){
    return this.microregional_bairro;
  }

  /**
   * Define microregional_bairro
   * @param microregional_bairro microregional_bairro
   * @generated
   */
  public microregional setMicroregional_bairro(java.lang.String microregional_bairro){
    this.microregional_bairro = microregional_bairro;
    return this;
  }

  /**
   * Obtém microregional_email
   * return microregional_email
   * @generated
   */
  
  public java.lang.String getMicroregional_email(){
    return this.microregional_email;
  }

  /**
   * Define microregional_email
   * @param microregional_email microregional_email
   * @generated
   */
  public microregional setMicroregional_email(java.lang.String microregional_email){
    this.microregional_email = microregional_email;
    return this;
  }

  /**
   * Obtém microregional_obs
   * return microregional_obs
   * @generated
   */
  
  public java.lang.String getMicroregional_obs(){
    return this.microregional_obs;
  }

  /**
   * Define microregional_obs
   * @param microregional_obs microregional_obs
   * @generated
   */
  public microregional setMicroregional_obs(java.lang.String microregional_obs){
    this.microregional_obs = microregional_obs;
    return this;
  }

  /**
   * Obtém regional
   * return regional
   * @generated
   */
  
  public regional getRegional(){
    return this.regional;
  }

  /**
   * Define regional
   * @param regional regional
   * @generated
   */
  public microregional setRegional(regional regional){
    this.regional = regional;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    microregional object = (microregional)obj;
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
