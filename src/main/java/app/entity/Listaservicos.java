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
 * Classe que representa a tabela LISTASERVICOS
 * @generated
 */
@Entity
@Table(name = "\"LISTASERVICOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Listaservicos")
public class Listaservicos implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataehora", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
  @CronapiSearchable
  
  private java.util.Date dataehora;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="localevento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private comum localevento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="atende1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private membros atende1;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="atende2", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private membros atende2;

  /**
  * @generated
  */
  @Column(name = "resultadoirmas", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Double resultadoirmas;

  /**
  * @generated
  */
  @Column(name = "resultadoirmaos", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Double resultadoirmaos;

  /**
  * @generated
  */
  @Column(name = "resultadototal", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Double resultadototal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_eventos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private eventos eventos;

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
  @JoinColumn(name="fk_nomeDaLista", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private NomeDaLista nomeDaLista;

  /**
   * Construtor
   * @generated
   */
  public Listaservicos(){
  }


  /**
   * Obtém dataehora
   * return dataehora
   * @generated
   */
  
  public java.util.Date getDataehora(){
    return this.dataehora;
  }

  /**
   * Define dataehora
   * @param dataehora dataehora
   * @generated
   */
  public Listaservicos setDataehora(java.util.Date dataehora){
    this.dataehora = dataehora;
    return this;
  }

  /**
   * Obtém localevento
   * return localevento
   * @generated
   */
  
  public comum getLocalevento(){
    return this.localevento;
  }

  /**
   * Define localevento
   * @param localevento localevento
   * @generated
   */
  public Listaservicos setLocalevento(comum localevento){
    this.localevento = localevento;
    return this;
  }

  /**
   * Obtém atende1
   * return atende1
   * @generated
   */
  
  public membros getAtende1(){
    return this.atende1;
  }

  /**
   * Define atende1
   * @param atende1 atende1
   * @generated
   */
  public Listaservicos setAtende1(membros atende1){
    this.atende1 = atende1;
    return this;
  }

  /**
   * Obtém atende2
   * return atende2
   * @generated
   */
  
  public membros getAtende2(){
    return this.atende2;
  }

  /**
   * Define atende2
   * @param atende2 atende2
   * @generated
   */
  public Listaservicos setAtende2(membros atende2){
    this.atende2 = atende2;
    return this;
  }

  /**
   * Obtém resultadoirmas
   * return resultadoirmas
   * @generated
   */
  
  public java.lang.Double getResultadoirmas(){
    return this.resultadoirmas;
  }

  /**
   * Define resultadoirmas
   * @param resultadoirmas resultadoirmas
   * @generated
   */
  public Listaservicos setResultadoirmas(java.lang.Double resultadoirmas){
    this.resultadoirmas = resultadoirmas;
    return this;
  }

  /**
   * Obtém resultadoirmaos
   * return resultadoirmaos
   * @generated
   */
  
  public java.lang.Double getResultadoirmaos(){
    return this.resultadoirmaos;
  }

  /**
   * Define resultadoirmaos
   * @param resultadoirmaos resultadoirmaos
   * @generated
   */
  public Listaservicos setResultadoirmaos(java.lang.Double resultadoirmaos){
    this.resultadoirmaos = resultadoirmaos;
    return this;
  }

  /**
   * Obtém resultadototal
   * return resultadototal
   * @generated
   */
  
  public java.lang.Double getResultadototal(){
    return this.resultadototal;
  }

  /**
   * Define resultadototal
   * @param resultadototal resultadototal
   * @generated
   */
  public Listaservicos setResultadototal(java.lang.Double resultadototal){
    this.resultadototal = resultadototal;
    return this;
  }

  /**
   * Obtém eventos
   * return eventos
   * @generated
   */
  
  public eventos getEventos(){
    return this.eventos;
  }

  /**
   * Define eventos
   * @param eventos eventos
   * @generated
   */
  public Listaservicos setEventos(eventos eventos){
    this.eventos = eventos;
    return this;
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
  public Listaservicos setId(java.lang.String id){
    this.id = id;
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
  public Listaservicos setRegional(regional regional){
    this.regional = regional;
    return this;
  }

  /**
   * Obtém nomeDaLista
   * return nomeDaLista
   * @generated
   */
  
  public NomeDaLista getNomeDaLista(){
    return this.nomeDaLista;
  }

  /**
   * Define nomeDaLista
   * @param nomeDaLista nomeDaLista
   * @generated
   */
  public Listaservicos setNomeDaLista(NomeDaLista nomeDaLista){
    this.nomeDaLista = nomeDaLista;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Listaservicos object = (Listaservicos)obj;
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
