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
 * Classe que representa a tabela EVENTOS
 * @generated
 */
@Entity
@Table(name = "\"EVENTOS\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"evento_nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.eventos")
public class eventos implements Serializable {

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
  @Column(name = "evento_nome", nullable = false, unique = true, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String evento_nome;

  /**
   * Construtor
   * @generated
   */
  public eventos(){
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
  public eventos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém evento_nome
   * return evento_nome
   * @generated
   */
  
  public java.lang.String getEvento_nome(){
    return this.evento_nome;
  }

  /**
   * Define evento_nome
   * @param evento_nome evento_nome
   * @generated
   */
  public eventos setEvento_nome(java.lang.String evento_nome){
    this.evento_nome = evento_nome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    eventos object = (eventos)obj;
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
