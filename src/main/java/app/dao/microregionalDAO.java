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
@Repository("microregionalDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface microregionalDAO extends JpaRepository<microregional, java.lang.String> {

  /**
   * Obtém a instância de microregional utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM microregional entity WHERE entity.id = :id")
  public microregional findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de microregional utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM microregional entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM comum entity WHERE entity.microregional.id = :id AND (entity.comum_nome like concat('%',coalesce(:search,''),'%') OR entity.comum_codrelatorio like concat('%',coalesce(:search,''),'%') OR entity.comum_cep like concat('%',coalesce(:search,''),'%') OR entity.comum_cnpj like concat('%',coalesce(:search,''),'%') OR entity.comum_fonefixo like concat('%',coalesce(:search,''),'%') OR entity.comum_logradouro like concat('%',coalesce(:search,''),'%') OR entity.comum_bairro like concat('%',coalesce(:search,''),'%') OR entity.comum_cidade like concat('%',coalesce(:search,''),'%'))")
  public Page<comum> findComumGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM comum entity WHERE entity.microregional.id = :id AND (:comum_nome is null OR entity.comum_nome like concat('%',:comum_nome,'%')) AND (:comum_codrelatorio is null OR entity.comum_codrelatorio like concat('%',:comum_codrelatorio,'%')) AND (:comum_cep is null OR entity.comum_cep like concat('%',:comum_cep,'%')) AND (:comum_cnpj is null OR entity.comum_cnpj like concat('%',:comum_cnpj,'%')) AND (:comum_fonefixo is null OR entity.comum_fonefixo like concat('%',:comum_fonefixo,'%')) AND (:comum_logradouro is null OR entity.comum_logradouro like concat('%',:comum_logradouro,'%')) AND (:comum_bairro is null OR entity.comum_bairro like concat('%',:comum_bairro,'%')) AND (:comum_cidade is null OR entity.comum_cidade like concat('%',:comum_cidade,'%'))")
  public Page<comum> findComumSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="comum_nome") java.lang.String comum_nome, @Param(value="comum_codrelatorio") java.lang.String comum_codrelatorio, @Param(value="comum_cep") java.lang.String comum_cep, @Param(value="comum_cnpj") java.lang.String comum_cnpj, @Param(value="comum_fonefixo") java.lang.String comum_fonefixo, @Param(value="comum_logradouro") java.lang.String comum_logradouro, @Param(value="comum_bairro") java.lang.String comum_bairro, @Param(value="comum_cidade") java.lang.String comum_cidade, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM comum entity WHERE entity.microregional.id = :id")
  public Page<comum> findComum(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.microregional.id = :id AND (entity.id like concat('%',coalesce(:search,''),'%') OR entity.membro_nomecompleto like concat('%',coalesce(:search,''),'%') OR entity.membro_cpf like concat('%',coalesce(:search,''),'%') OR entity.membro_nomecurto like concat('%',coalesce(:search,''),'%') OR entity.membro_dataapresentacao like concat('%',coalesce(:search,''),'%') OR entity.membro_cartaoccb like concat('%',coalesce(:search,''),'%') OR entity.membro_evidencianovaslinguas like concat('%',coalesce(:search,''),'%') OR entity.membro_status like concat('%',coalesce(:search,''),'%') OR entity.membro_datanasc like concat('%',coalesce(:search,''),'%') OR entity.membro_databatismo like concat('%',coalesce(:search,''),'%') OR entity.membro_estadocivil like concat('%',coalesce(:search,''),'%') OR entity.membro_sexo like concat('%',coalesce(:search,''),'%') OR entity.membro_numerorg like concat('%',coalesce(:search,''),'%') OR entity.membro_orgemissoruf like concat('%',coalesce(:search,''),'%') OR entity.membro_dataexpedicao like concat('%',coalesce(:search,''),'%') OR entity.membro_especial like concat('%',coalesce(:search,''),'%') OR entity.membro_numeropispasep like concat('%',coalesce(:search,''),'%') OR entity.membro_profissao like concat('%',coalesce(:search,''),'%') OR entity.membro_fonefixo like concat('%',coalesce(:search,''),'%') OR entity.membro_fonecelular like concat('%',coalesce(:search,''),'%') OR entity.membro_cidadeuf like concat('%',coalesce(:search,''),'%') OR entity.membro_cep like concat('%',coalesce(:search,''),'%') OR entity.membro_bairro like concat('%',coalesce(:search,''),'%') OR entity.membro_logradouro like concat('%',coalesce(:search,''),'%') OR entity.membro_pontoreferencia like concat('%',coalesce(:search,''),'%') OR entity.membro_email like concat('%',coalesce(:search,''),'%') OR entity.membro_mae like concat('%',coalesce(:search,''),'%') OR entity.membro_pai like concat('%',coalesce(:search,''),'%') OR entity.membro_obs like concat('%',coalesce(:search,''),'%'))")
  public Page<membros> findMembrosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.microregional.id = :id AND (:id is null OR entity.id like concat('%',:id,'%')) AND (:membro_nomecompleto is null OR entity.membro_nomecompleto like concat('%',:membro_nomecompleto,'%')) AND (:membro_cpf is null OR entity.membro_cpf like concat('%',:membro_cpf,'%')) AND (:membro_nomecurto is null OR entity.membro_nomecurto like concat('%',:membro_nomecurto,'%')) AND (:membro_dataapresentacao is null OR entity.membro_dataapresentacao like concat('%',:membro_dataapresentacao,'%')) AND (:membro_cartaoccb is null OR entity.membro_cartaoccb like concat('%',:membro_cartaoccb,'%')) AND (:membro_evidencianovaslinguas is null OR entity.membro_evidencianovaslinguas like concat('%',:membro_evidencianovaslinguas,'%')) AND (:membro_status is null OR entity.membro_status like concat('%',:membro_status,'%')) AND (:membro_datanasc is null OR entity.membro_datanasc like concat('%',:membro_datanasc,'%')) AND (:membro_databatismo is null OR entity.membro_databatismo like concat('%',:membro_databatismo,'%')) AND (:membro_estadocivil is null OR entity.membro_estadocivil like concat('%',:membro_estadocivil,'%')) AND (:membro_sexo is null OR entity.membro_sexo like concat('%',:membro_sexo,'%')) AND (:membro_numerorg is null OR entity.membro_numerorg like concat('%',:membro_numerorg,'%')) AND (:membro_orgemissoruf is null OR entity.membro_orgemissoruf like concat('%',:membro_orgemissoruf,'%')) AND (:membro_dataexpedicao is null OR entity.membro_dataexpedicao like concat('%',:membro_dataexpedicao,'%')) AND (:membro_especial is null OR entity.membro_especial like concat('%',:membro_especial,'%')) AND (:membro_numeropispasep is null OR entity.membro_numeropispasep like concat('%',:membro_numeropispasep,'%')) AND (:membro_profissao is null OR entity.membro_profissao like concat('%',:membro_profissao,'%')) AND (:membro_fonefixo is null OR entity.membro_fonefixo like concat('%',:membro_fonefixo,'%')) AND (:membro_fonecelular is null OR entity.membro_fonecelular like concat('%',:membro_fonecelular,'%')) AND (:membro_cidadeuf is null OR entity.membro_cidadeuf like concat('%',:membro_cidadeuf,'%')) AND (:membro_cep is null OR entity.membro_cep like concat('%',:membro_cep,'%')) AND (:membro_bairro is null OR entity.membro_bairro like concat('%',:membro_bairro,'%')) AND (:membro_logradouro is null OR entity.membro_logradouro like concat('%',:membro_logradouro,'%')) AND (:membro_pontoreferencia is null OR entity.membro_pontoreferencia like concat('%',:membro_pontoreferencia,'%')) AND (:membro_email is null OR entity.membro_email like concat('%',:membro_email,'%')) AND (:membro_mae is null OR entity.membro_mae like concat('%',:membro_mae,'%')) AND (:membro_pai is null OR entity.membro_pai like concat('%',:membro_pai,'%')) AND (:membro_obs is null OR entity.membro_obs like concat('%',:membro_obs,'%'))")
  public Page<membros> findMembrosSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="membro_nomecompleto") java.lang.String membro_nomecompleto, @Param(value="membro_cpf") java.lang.String membro_cpf, @Param(value="membro_nomecurto") java.lang.String membro_nomecurto, @Param(value="membro_dataapresentacao") java.lang.String membro_dataapresentacao, @Param(value="membro_cartaoccb") java.lang.String membro_cartaoccb, @Param(value="membro_evidencianovaslinguas") java.lang.String membro_evidencianovaslinguas, @Param(value="membro_status") java.lang.String membro_status, @Param(value="membro_datanasc") java.lang.String membro_datanasc, @Param(value="membro_databatismo") java.lang.String membro_databatismo, @Param(value="membro_estadocivil") java.lang.String membro_estadocivil, @Param(value="membro_sexo") java.lang.String membro_sexo, @Param(value="membro_numerorg") java.lang.String membro_numerorg, @Param(value="membro_orgemissoruf") java.lang.String membro_orgemissoruf, @Param(value="membro_dataexpedicao") java.lang.String membro_dataexpedicao, @Param(value="membro_especial") java.lang.String membro_especial, @Param(value="membro_numeropispasep") java.lang.String membro_numeropispasep, @Param(value="membro_profissao") java.lang.String membro_profissao, @Param(value="membro_fonefixo") java.lang.String membro_fonefixo, @Param(value="membro_fonecelular") java.lang.String membro_fonecelular, @Param(value="membro_cidadeuf") java.lang.String membro_cidadeuf, @Param(value="membro_cep") java.lang.String membro_cep, @Param(value="membro_bairro") java.lang.String membro_bairro, @Param(value="membro_logradouro") java.lang.String membro_logradouro, @Param(value="membro_pontoreferencia") java.lang.String membro_pontoreferencia, @Param(value="membro_email") java.lang.String membro_email, @Param(value="membro_mae") java.lang.String membro_mae, @Param(value="membro_pai") java.lang.String membro_pai, @Param(value="membro_obs") java.lang.String membro_obs, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM membros entity WHERE entity.microregional.id = :id")
  public Page<membros> findMembros(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.regional FROM comum entity WHERE entity.microregional.id = :id AND (entity.regional.regional_nome like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_sede like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_cep like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_fonefixo like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_fonecel like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_logradouro like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_bairro like concat('%',coalesce(:search,''),'%') OR entity.regional.regional_email like concat('%',coalesce(:search,''),'%'))")
  public Page<regional> listRegionalGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.regional FROM comum entity WHERE entity.microregional.id = :id AND (:regional_nome is null OR entity.regional.regional_nome like concat('%',:regional_nome,'%')) AND (:regional_sede is null OR entity.regional.regional_sede like concat('%',:regional_sede,'%')) AND (:regional_cep is null OR entity.regional.regional_cep like concat('%',:regional_cep,'%')) AND (:regional_fonefixo is null OR entity.regional.regional_fonefixo like concat('%',:regional_fonefixo,'%')) AND (:regional_fonecel is null OR entity.regional.regional_fonecel like concat('%',:regional_fonecel,'%')) AND (:regional_logradouro is null OR entity.regional.regional_logradouro like concat('%',:regional_logradouro,'%')) AND (:regional_bairro is null OR entity.regional.regional_bairro like concat('%',:regional_bairro,'%')) AND (:regional_email is null OR entity.regional.regional_email like concat('%',:regional_email,'%'))")
  public Page<regional> listRegionalSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="regional_nome") java.lang.String regional_nome, @Param(value="regional_sede") java.lang.String regional_sede, @Param(value="regional_cep") java.lang.String regional_cep, @Param(value="regional_fonefixo") java.lang.String regional_fonefixo, @Param(value="regional_fonecel") java.lang.String regional_fonecel, @Param(value="regional_logradouro") java.lang.String regional_logradouro, @Param(value="regional_bairro") java.lang.String regional_bairro, @Param(value="regional_email") java.lang.String regional_email, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.regional FROM comum entity WHERE entity.microregional.id = :id")
  public Page<regional> listRegional(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM comum entity WHERE entity.microregional.id = :instanceId AND entity.regional.id = :relationId")
  public int deleteRegional(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM microregional entity WHERE entity.microregional_nome like concat('%',coalesce(:search,''),'%') OR entity.microregional_sede like concat('%',coalesce(:search,''),'%') OR entity.microregionao_cep like concat('%',coalesce(:search,''),'%') OR entity.microregional_fonefixo like concat('%',coalesce(:search,''),'%') OR entity.microregional_fonecel like concat('%',coalesce(:search,''),'%') OR entity.microregional_logradouro like concat('%',coalesce(:search,''),'%') OR entity.microregional_bairro like concat('%',coalesce(:search,''),'%') OR entity.microregional_email like concat('%',coalesce(:search,''),'%')")
  public Page<microregional> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM microregional entity WHERE (:microregional_nome is null OR entity.microregional_nome like concat('%',:microregional_nome,'%')) AND (:microregional_sede is null OR entity.microregional_sede like concat('%',:microregional_sede,'%')) AND (:microregionao_cep is null OR entity.microregionao_cep like concat('%',:microregionao_cep,'%')) AND (:microregional_fonefixo is null OR entity.microregional_fonefixo like concat('%',:microregional_fonefixo,'%')) AND (:microregional_fonecel is null OR entity.microregional_fonecel like concat('%',:microregional_fonecel,'%')) AND (:microregional_logradouro is null OR entity.microregional_logradouro like concat('%',:microregional_logradouro,'%')) AND (:microregional_bairro is null OR entity.microregional_bairro like concat('%',:microregional_bairro,'%')) AND (:microregional_email is null OR entity.microregional_email like concat('%',:microregional_email,'%'))")
  public Page<microregional> specificSearch(@Param(value="microregional_nome") java.lang.String microregional_nome, @Param(value="microregional_sede") java.lang.String microregional_sede, @Param(value="microregionao_cep") java.lang.String microregionao_cep, @Param(value="microregional_fonefixo") java.lang.String microregional_fonefixo, @Param(value="microregional_fonecel") java.lang.String microregional_fonecel, @Param(value="microregional_logradouro") java.lang.String microregional_logradouro, @Param(value="microregional_bairro") java.lang.String microregional_bairro, @Param(value="microregional_email") java.lang.String microregional_email, Pageable pageable);
  
  /**
   * Foreign Key regional
   * @generated
   */
  @Query("SELECT entity FROM microregional entity WHERE entity.regional.id = :id")
  public Page<microregional> findmicroregionalsByRegional(@Param(value="id") java.lang.String id, Pageable pageable);

}
