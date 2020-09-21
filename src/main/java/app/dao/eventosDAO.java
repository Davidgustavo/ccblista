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
@Repository("eventosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface eventosDAO extends JpaRepository<eventos, java.lang.String> {

  /**
   * Obtém a instância de eventos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM eventos entity WHERE entity.id = :id")
  public eventos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de eventos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM eventos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.eventos.id = :id AND (:search = :search)")
  public Page<Listaservicos> findListaservicosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.eventos.id = :id AND (:dataehora is null OR entity.dataehora = :dataehora)")
  public Page<Listaservicos> findListaservicosSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="dataehora") java.util.Date dataehora, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.eventos.id = :id")
  public Page<Listaservicos> findListaservicos(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM eventos entity WHERE entity.evento_nome like concat('%',coalesce(:search,''),'%')")
  public Page<eventos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM eventos entity WHERE (:evento_nome is null OR entity.evento_nome like concat('%',:evento_nome,'%'))")
  public Page<eventos> specificSearch(@Param(value="evento_nome") java.lang.String evento_nome, Pageable pageable);
  
}
