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
@Repository("funcaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface funcaoDAO extends JpaRepository<funcao, java.lang.String> {

  /**
   * Obtém a instância de funcao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM funcao entity WHERE entity.id = :id")
  public funcao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de funcao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM funcao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.funcao.id = :id AND (entity.id like concat('%',coalesce(:search,''),'%') OR entity.membro_nomecompleto like concat('%',coalesce(:search,''),'%') OR entity.membro_cpf like concat('%',coalesce(:search,''),'%') OR entity.membro_nomecurto like concat('%',coalesce(:search,''),'%') OR entity.membro_dataapresentacao like concat('%',coalesce(:search,''),'%') OR entity.membro_cartaoccb like concat('%',coalesce(:search,''),'%') OR entity.membro_evidencianovaslinguas like concat('%',coalesce(:search,''),'%') OR entity.membro_status like concat('%',coalesce(:search,''),'%') OR entity.membro_datanasc like concat('%',coalesce(:search,''),'%') OR entity.membro_databatismo like concat('%',coalesce(:search,''),'%') OR entity.membro_estadocivil like concat('%',coalesce(:search,''),'%') OR entity.membro_sexo like concat('%',coalesce(:search,''),'%') OR entity.membro_numerorg like concat('%',coalesce(:search,''),'%') OR entity.membro_orgemissoruf like concat('%',coalesce(:search,''),'%') OR entity.membro_dataexpedicao like concat('%',coalesce(:search,''),'%') OR entity.membro_especial like concat('%',coalesce(:search,''),'%') OR entity.membro_numeropispasep like concat('%',coalesce(:search,''),'%') OR entity.membro_profissao like concat('%',coalesce(:search,''),'%') OR entity.membro_fonefixo like concat('%',coalesce(:search,''),'%') OR entity.membro_fonecelular like concat('%',coalesce(:search,''),'%') OR entity.membro_cidadeuf like concat('%',coalesce(:search,''),'%') OR entity.membro_cep like concat('%',coalesce(:search,''),'%') OR entity.membro_bairro like concat('%',coalesce(:search,''),'%') OR entity.membro_logradouro like concat('%',coalesce(:search,''),'%') OR entity.membro_pontoreferencia like concat('%',coalesce(:search,''),'%') OR entity.membro_email like concat('%',coalesce(:search,''),'%') OR entity.membro_mae like concat('%',coalesce(:search,''),'%') OR entity.membro_pai like concat('%',coalesce(:search,''),'%') OR entity.membro_obs like concat('%',coalesce(:search,''),'%'))")
  public Page<membros> findMembrosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.funcao.id = :id AND (:id is null OR entity.id like concat('%',:id,'%')) AND (:membro_nomecompleto is null OR entity.membro_nomecompleto like concat('%',:membro_nomecompleto,'%')) AND (:membro_cpf is null OR entity.membro_cpf like concat('%',:membro_cpf,'%')) AND (:membro_nomecurto is null OR entity.membro_nomecurto like concat('%',:membro_nomecurto,'%')) AND (:membro_dataapresentacao is null OR entity.membro_dataapresentacao like concat('%',:membro_dataapresentacao,'%')) AND (:membro_cartaoccb is null OR entity.membro_cartaoccb like concat('%',:membro_cartaoccb,'%')) AND (:membro_evidencianovaslinguas is null OR entity.membro_evidencianovaslinguas like concat('%',:membro_evidencianovaslinguas,'%')) AND (:membro_status is null OR entity.membro_status like concat('%',:membro_status,'%')) AND (:membro_datanasc is null OR entity.membro_datanasc like concat('%',:membro_datanasc,'%')) AND (:membro_databatismo is null OR entity.membro_databatismo like concat('%',:membro_databatismo,'%')) AND (:membro_estadocivil is null OR entity.membro_estadocivil like concat('%',:membro_estadocivil,'%')) AND (:membro_sexo is null OR entity.membro_sexo like concat('%',:membro_sexo,'%')) AND (:membro_numerorg is null OR entity.membro_numerorg like concat('%',:membro_numerorg,'%')) AND (:membro_orgemissoruf is null OR entity.membro_orgemissoruf like concat('%',:membro_orgemissoruf,'%')) AND (:membro_dataexpedicao is null OR entity.membro_dataexpedicao like concat('%',:membro_dataexpedicao,'%')) AND (:membro_especial is null OR entity.membro_especial like concat('%',:membro_especial,'%')) AND (:membro_numeropispasep is null OR entity.membro_numeropispasep like concat('%',:membro_numeropispasep,'%')) AND (:membro_profissao is null OR entity.membro_profissao like concat('%',:membro_profissao,'%')) AND (:membro_fonefixo is null OR entity.membro_fonefixo like concat('%',:membro_fonefixo,'%')) AND (:membro_fonecelular is null OR entity.membro_fonecelular like concat('%',:membro_fonecelular,'%')) AND (:membro_cidadeuf is null OR entity.membro_cidadeuf like concat('%',:membro_cidadeuf,'%')) AND (:membro_cep is null OR entity.membro_cep like concat('%',:membro_cep,'%')) AND (:membro_bairro is null OR entity.membro_bairro like concat('%',:membro_bairro,'%')) AND (:membro_logradouro is null OR entity.membro_logradouro like concat('%',:membro_logradouro,'%')) AND (:membro_pontoreferencia is null OR entity.membro_pontoreferencia like concat('%',:membro_pontoreferencia,'%')) AND (:membro_email is null OR entity.membro_email like concat('%',:membro_email,'%')) AND (:membro_mae is null OR entity.membro_mae like concat('%',:membro_mae,'%')) AND (:membro_pai is null OR entity.membro_pai like concat('%',:membro_pai,'%')) AND (:membro_obs is null OR entity.membro_obs like concat('%',:membro_obs,'%'))")
  public Page<membros> findMembrosSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="membro_nomecompleto") java.lang.String membro_nomecompleto, @Param(value="membro_cpf") java.lang.String membro_cpf, @Param(value="membro_nomecurto") java.lang.String membro_nomecurto, @Param(value="membro_dataapresentacao") java.lang.String membro_dataapresentacao, @Param(value="membro_cartaoccb") java.lang.String membro_cartaoccb, @Param(value="membro_evidencianovaslinguas") java.lang.String membro_evidencianovaslinguas, @Param(value="membro_status") java.lang.String membro_status, @Param(value="membro_datanasc") java.lang.String membro_datanasc, @Param(value="membro_databatismo") java.lang.String membro_databatismo, @Param(value="membro_estadocivil") java.lang.String membro_estadocivil, @Param(value="membro_sexo") java.lang.String membro_sexo, @Param(value="membro_numerorg") java.lang.String membro_numerorg, @Param(value="membro_orgemissoruf") java.lang.String membro_orgemissoruf, @Param(value="membro_dataexpedicao") java.lang.String membro_dataexpedicao, @Param(value="membro_especial") java.lang.String membro_especial, @Param(value="membro_numeropispasep") java.lang.String membro_numeropispasep, @Param(value="membro_profissao") java.lang.String membro_profissao, @Param(value="membro_fonefixo") java.lang.String membro_fonefixo, @Param(value="membro_fonecelular") java.lang.String membro_fonecelular, @Param(value="membro_cidadeuf") java.lang.String membro_cidadeuf, @Param(value="membro_cep") java.lang.String membro_cep, @Param(value="membro_bairro") java.lang.String membro_bairro, @Param(value="membro_logradouro") java.lang.String membro_logradouro, @Param(value="membro_pontoreferencia") java.lang.String membro_pontoreferencia, @Param(value="membro_email") java.lang.String membro_email, @Param(value="membro_mae") java.lang.String membro_mae, @Param(value="membro_pai") java.lang.String membro_pai, @Param(value="membro_obs") java.lang.String membro_obs, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.funcao.id = :id")
  public Page<membros> findMembros(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM funcao entity WHERE entity.id like concat('%',coalesce(:search,''),'%') OR entity.funcao_nome like concat('%',coalesce(:search,''),'%')")
  public Page<funcao> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM funcao entity WHERE (:id is null OR entity.id like concat('%',:id,'%')) AND (:funcao_nome is null OR entity.funcao_nome like concat('%',:funcao_nome,'%'))")
  public Page<funcao> specificSearch(@Param(value="id") java.lang.String id, @Param(value="funcao_nome") java.lang.String funcao_nome, Pageable pageable);
  
}
