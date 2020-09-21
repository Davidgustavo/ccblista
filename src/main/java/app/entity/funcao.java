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
 * Classe que representa a tabela FUNCAO
 * @generated
 */
@Entity
@Table(name = "\"FUNCAO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"funcao_nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.funcao")
public class funcao implements Serializable {

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
  @Column(name = "funcao_nome", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String funcao_nome;

  /**
   * Construtor
   * @generated
   */
  public funcao(){
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
  public funcao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém funcao_nome
   * return funcao_nome
   * @generated
   */
  
  public java.lang.String getFuncao_nome(){
    return this.funcao_nome;
  }

  /**
   * Define funcao_nome
   * @param funcao_nome funcao_nome
   * @generated
   */
  public funcao setFuncao_nome(java.lang.String funcao_nome){
    this.funcao_nome = funcao_nome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    funcao object = (funcao)obj;
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
