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
@Repository("NomeDaListaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface NomeDaListaDAO extends JpaRepository<NomeDaLista, java.lang.Integer> {

  /**
   * Obtém a instância de NomeDaLista utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM NomeDaLista entity WHERE entity.id = :id")
  public NomeDaLista findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de NomeDaLista utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM NomeDaLista entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.nomeDaLista.id = :id AND (:search = :search)")
  public Page<Listaservicos> findListaservicosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.nomeDaLista.id = :id AND (:dataehora is null OR entity.dataehora = :dataehora)")
  public Page<Listaservicos> findListaservicosSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="dataehora") java.util.Date dataehora, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Listaservicos entity WHERE entity.nomeDaLista.id = :id")
  public Page<Listaservicos> findListaservicos(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key regional
   * @generated
   */
  @Query("SELECT entity FROM NomeDaLista entity WHERE entity.regional.id = :id")
  public Page<NomeDaLista> findNomeDaListasByRegional(@Param(value="id") java.lang.String id, Pageable pageable);

}
