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
 * Classe que representa a tabela COMUM
 * @generated
 */
@Entity
@Table(name = "\"COMUM\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"comum_nome" ,"comum_codrelatorio" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.comum")
public class comum implements Serializable {

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
  @Column(name = "comum_nome", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_nome;

  /**
  * @generated
  */
  @Column(name = "comum_codrelatorio", nullable = false, unique = true, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_codrelatorio;

  /**
  * @generated
  */
  @Column(name = "comum_cep", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_cep;

  /**
  * @generated
  */
  @Column(name = "comum_cnpj", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_cnpj;

  /**
  * @generated
  */
  @Column(name = "comum_fonefixo", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_fonefixo;

  /**
  * @generated
  */
  @Column(name = "comum_logradouro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_logradouro;

  /**
  * @generated
  */
  @Column(name = "comum_bairro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_bairro;

  /**
  * @generated
  */
  @Column(name = "comum_cidade", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String comum_cidade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_regional", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private regional regional;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_microregional", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private microregional microregional;

  /**
   * Construtor
   * @generated
   */
  public comum(){
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
  public comum setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém comum_nome
   * return comum_nome
   * @generated
   */
  
  public java.lang.String getComum_nome(){
    return this.comum_nome;
  }

  /**
   * Define comum_nome
   * @param comum_nome comum_nome
   * @generated
   */
  public comum setComum_nome(java.lang.String comum_nome){
    this.comum_nome = comum_nome;
    return this;
  }

  /**
   * Obtém comum_codrelatorio
   * return comum_codrelatorio
   * @generated
   */
  
  public java.lang.String getComum_codrelatorio(){
    return this.comum_codrelatorio;
  }

  /**
   * Define comum_codrelatorio
   * @param comum_codrelatorio comum_codrelatorio
   * @generated
   */
  public comum setComum_codrelatorio(java.lang.String comum_codrelatorio){
    this.comum_codrelatorio = comum_codrelatorio;
    return this;
  }

  /**
   * Obtém comum_cep
   * return comum_cep
   * @generated
   */
  
  public java.lang.String getComum_cep(){
    return this.comum_cep;
  }

  /**
   * Define comum_cep
   * @param comum_cep comum_cep
   * @generated
   */
  public comum setComum_cep(java.lang.String comum_cep){
    this.comum_cep = comum_cep;
    return this;
  }

  /**
   * Obtém comum_cnpj
   * return comum_cnpj
   * @generated
   */
  
  public java.lang.String getComum_cnpj(){
    return this.comum_cnpj;
  }

  /**
   * Define comum_cnpj
   * @param comum_cnpj comum_cnpj
   * @generated
   */
  public comum setComum_cnpj(java.lang.String comum_cnpj){
    this.comum_cnpj = comum_cnpj;
    return this;
  }

  /**
   * Obtém comum_fonefixo
   * return comum_fonefixo
   * @generated
   */
  
  public java.lang.String getComum_fonefixo(){
    return this.comum_fonefixo;
  }

  /**
   * Define comum_fonefixo
   * @param comum_fonefixo comum_fonefixo
   * @generated
   */
  public comum setComum_fonefixo(java.lang.String comum_fonefixo){
    this.comum_fonefixo = comum_fonefixo;
    return this;
  }

  /**
   * Obtém comum_logradouro
   * return comum_logradouro
   * @generated
   */
  
  public java.lang.String getComum_logradouro(){
    return this.comum_logradouro;
  }

  /**
   * Define comum_logradouro
   * @param comum_logradouro comum_logradouro
   * @generated
   */
  public comum setComum_logradouro(java.lang.String comum_logradouro){
    this.comum_logradouro = comum_logradouro;
    return this;
  }

  /**
   * Obtém comum_bairro
   * return comum_bairro
   * @generated
   */
  
  public java.lang.String getComum_bairro(){
    return this.comum_bairro;
  }

  /**
   * Define comum_bairro
   * @param comum_bairro comum_bairro
   * @generated
   */
  public comum setComum_bairro(java.lang.String comum_bairro){
    this.comum_bairro = comum_bairro;
    return this;
  }

  /**
   * Obtém comum_cidade
   * return comum_cidade
   * @generated
   */
  
  public java.lang.String getComum_cidade(){
    return this.comum_cidade;
  }

  /**
   * Define comum_cidade
   * @param comum_cidade comum_cidade
   * @generated
   */
  public comum setComum_cidade(java.lang.String comum_cidade){
    this.comum_cidade = comum_cidade;
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
  public comum setRegional(regional regional){
    this.regional = regional;
    return this;
  }

  /**
   * Obtém microregional
   * return microregional
   * @generated
   */
  
  public microregional getMicroregional(){
    return this.microregional;
  }

  /**
   * Define microregional
   * @param microregional microregional
   * @generated
   */
  public comum setMicroregional(microregional microregional){
    this.microregional = microregional;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    comum object = (comum)obj;
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
