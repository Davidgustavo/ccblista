package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ListaservicosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ListaservicosDAO extends JpaRepository<Listaservicos, java.lang.String> {

  /**
   * Obtém a instância de Listaservicos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.id = :id")
  public Listaservicos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Listaservicos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Listaservicos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE :search = :search")
  public Page<Listaservicos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE (:dataehora is null OR entity.dataehora = :dataehora)")
  public Page<Listaservicos> specificSearch(@Param(value="dataehora") java.util.Date dataehora, Pageable pageable);
  
  /**
   * Foreign Key localevento
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.localevento.id = :id")
  public Page<Listaservicos> findListaservicossByLocalevento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key atende1
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.atende1.id = :id")
  public Page<Listaservicos> findListaservicossByAtende1(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key atende2
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.atende2.id = :id")
  public Page<Listaservicos> findListaservicossByAtende2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key eventos
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.eventos.id = :id")
  public Page<Listaservicos> findListaservicossByEventos(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key regional
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.regional.id = :id")
  public Page<Listaservicos> findListaservicossByRegional(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key nomeDaLista
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.nomeDaLista.id = :id")
  public Page<Listaservicos> findListaservicossByNomeDaLista(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
