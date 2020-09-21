package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela NOMEDALISTA
 * @generated
 */
@Entity
@Table(name = "\"NOMEDALISTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.NomeDaLista")
public class NomeDaLista implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "avisos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String avisos;

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
  public NomeDaLista(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public NomeDaLista setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public NomeDaLista setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém avisos
   * return avisos
   * @generated
   */
  
  public java.lang.String getAvisos(){
    return this.avisos;
  }

  /**
   * Define avisos
   * @param avisos avisos
   * @generated
   */
  public NomeDaLista setAvisos(java.lang.String avisos){
    this.avisos = avisos;
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
  public NomeDaLista setRegional(regional regional){
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
    NomeDaLista object = (NomeDaLista)obj;
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
