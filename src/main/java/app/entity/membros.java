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
 * Classe que representa a tabela MEMBROS
 * @generated
 */
@Entity
@Table(name = "\"MEMBROS\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"membro_cpf" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.membros")
public class membros implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "membro_nomecompleto", nullable = false, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_nomecompleto;

  /**
  * @generated
  */
  @Column(name = "membro_cpf", nullable = false, unique = true, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_cpf;

  /**
  * @generated
  */
  @Column(name = "membro_nomecurto", nullable = false, unique = false, length=27, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_nomecurto;

  /**
  * @generated
  */
  @Column(name = "membro_dataapresentacao", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_dataapresentacao;

  /**
  * @generated
  */
  @Column(name = "membro_cartaoccb", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_cartaoccb;

  /**
  * @generated
  */
  @Column(name = "membro_evidencianovaslinguas", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_evidencianovaslinguas;

  /**
  * @generated
  */
  @Column(name = "membro_status", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_status;

  /**
  * @generated
  */
  @Column(name = "membro_datanasc", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_datanasc;

  /**
  * @generated
  */
  @Column(name = "membro_databatismo", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_databatismo;

  /**
  * @generated
  */
  @Column(name = "membro_estadocivil", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_estadocivil;

  /**
  * @generated
  */
  @Column(name = "membro_sexo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_sexo;

  /**
  * @generated
  */
  @Column(name = "membro_numerorg", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_numerorg;

  /**
  * @generated
  */
  @Column(name = "membro_orgemissoruf", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_orgemissoruf;

  /**
  * @generated
  */
  @Column(name = "membro_dataexpedicao", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_dataexpedicao;

  /**
  * @generated
  */
  @Column(name = "membro_especial", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_especial;

  /**
  * @generated
  */
  @Column(name = "membro_numeropispasep", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_numeropispasep;

  /**
  * @generated
  */
  @Column(name = "membro_profissao", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_profissao;

  /**
  * @generated
  */
  @Column(name = "membro_fonefixo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_fonefixo;

  /**
  * @generated
  */
  @Column(name = "membro_fonecelular", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_fonecelular;

  /**
  * @generated
  */
  @Column(name = "membro_cidadeuf", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_cidadeuf;

  /**
  * @generated
  */
  @Column(name = "membro_cep", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_cep;

  /**
  * @generated
  */
  @Column(name = "membro_bairro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_bairro;

  /**
  * @generated
  */
  @Column(name = "membro_logradouro", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_logradouro;

  /**
  * @generated
  */
  @Column(name = "membro_pontoreferencia", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_pontoreferencia;

  /**
  * @generated
  */
  @Column(name = "membro_email", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_email;

  /**
  * @generated
  */
  @Column(name = "membro_mae", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_mae;

  /**
  * @generated
  */
  @Column(name = "membro_pai", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_pai;

  /**
  * @generated
  */
  @Column(name = "membro_obs", nullable = true, unique = false, length=10000, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String membro_obs;

  /**
  * @generated
  */
  @Column(name = "membro_foto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] membro_foto;

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
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_comum", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private comum comum;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private funcao funcao;

  /**
   * Construtor
   * @generated
   */
  public membros(){
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
  public membros setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém membro_nomecompleto
   * return membro_nomecompleto
   * @generated
   */
  
  public java.lang.String getMembro_nomecompleto(){
    return this.membro_nomecompleto;
  }

  /**
   * Define membro_nomecompleto
   * @param membro_nomecompleto membro_nomecompleto
   * @generated
   */
  public membros setMembro_nomecompleto(java.lang.String membro_nomecompleto){
    this.membro_nomecompleto = membro_nomecompleto;
    return this;
  }

  /**
   * Obtém membro_cpf
   * return membro_cpf
   * @generated
   */
  
  public java.lang.String getMembro_cpf(){
    return this.membro_cpf;
  }

  /**
   * Define membro_cpf
   * @param membro_cpf membro_cpf
   * @generated
   */
  public membros setMembro_cpf(java.lang.String membro_cpf){
    this.membro_cpf = membro_cpf;
    return this;
  }

  /**
   * Obtém membro_nomecurto
   * return membro_nomecurto
   * @generated
   */
  
  public java.lang.String getMembro_nomecurto(){
    return this.membro_nomecurto;
  }

  /**
   * Define membro_nomecurto
   * @param membro_nomecurto membro_nomecurto
   * @generated
   */
  public membros setMembro_nomecurto(java.lang.String membro_nomecurto){
    this.membro_nomecurto = membro_nomecurto;
    return this;
  }

  /**
   * Obtém membro_dataapresentacao
   * return membro_dataapresentacao
   * @generated
   */
  
  public java.lang.String getMembro_dataapresentacao(){
    return this.membro_dataapresentacao;
  }

  /**
   * Define membro_dataapresentacao
   * @param membro_dataapresentacao membro_dataapresentacao
   * @generated
   */
  public membros setMembro_dataapresentacao(java.lang.String membro_dataapresentacao){
    this.membro_dataapresentacao = membro_dataapresentacao;
    return this;
  }

  /**
   * Obtém membro_cartaoccb
   * return membro_cartaoccb
   * @generated
   */
  
  public java.lang.String getMembro_cartaoccb(){
    return this.membro_cartaoccb;
  }

  /**
   * Define membro_cartaoccb
   * @param membro_cartaoccb membro_cartaoccb
   * @generated
   */
  public membros setMembro_cartaoccb(java.lang.String membro_cartaoccb){
    this.membro_cartaoccb = membro_cartaoccb;
    return this;
  }

  /**
   * Obtém membro_evidencianovaslinguas
   * return membro_evidencianovaslinguas
   * @generated
   */
  
  public java.lang.String getMembro_evidencianovaslinguas(){
    return this.membro_evidencianovaslinguas;
  }

  /**
   * Define membro_evidencianovaslinguas
   * @param membro_evidencianovaslinguas membro_evidencianovaslinguas
   * @generated
   */
  public membros setMembro_evidencianovaslinguas(java.lang.String membro_evidencianovaslinguas){
    this.membro_evidencianovaslinguas = membro_evidencianovaslinguas;
    return this;
  }

  /**
   * Obtém membro_status
   * return membro_status
   * @generated
   */
  
  public java.lang.String getMembro_status(){
    return this.membro_status;
  }

  /**
   * Define membro_status
   * @param membro_status membro_status
   * @generated
   */
  public membros setMembro_status(java.lang.String membro_status){
    this.membro_status = membro_status;
    return this;
  }

  /**
   * Obtém membro_datanasc
   * return membro_datanasc
   * @generated
   */
  
  public java.lang.String getMembro_datanasc(){
    return this.membro_datanasc;
  }

  /**
   * Define membro_datanasc
   * @param membro_datanasc membro_datanasc
   * @generated
   */
  public membros setMembro_datanasc(java.lang.String membro_datanasc){
    this.membro_datanasc = membro_datanasc;
    return this;
  }

  /**
   * Obtém membro_databatismo
   * return membro_databatismo
   * @generated
   */
  
  public java.lang.String getMembro_databatismo(){
    return this.membro_databatismo;
  }

  /**
   * Define membro_databatismo
   * @param membro_databatismo membro_databatismo
   * @generated
   */
  public membros setMembro_databatismo(java.lang.String membro_databatismo){
    this.membro_databatismo = membro_databatismo;
    return this;
  }

  /**
   * Obtém membro_estadocivil
   * return membro_estadocivil
   * @generated
   */
  
  public java.lang.String getMembro_estadocivil(){
    return this.membro_estadocivil;
  }

  /**
   * Define membro_estadocivil
   * @param membro_estadocivil membro_estadocivil
   * @generated
   */
  public membros setMembro_estadocivil(java.lang.String membro_estadocivil){
    this.membro_estadocivil = membro_estadocivil;
    return this;
  }

  /**
   * Obtém membro_sexo
   * return membro_sexo
   * @generated
   */
  
  public java.lang.String getMembro_sexo(){
    return this.membro_sexo;
  }

  /**
   * Define membro_sexo
   * @param membro_sexo membro_sexo
   * @generated
   */
  public membros setMembro_sexo(java.lang.String membro_sexo){
    this.membro_sexo = membro_sexo;
    return this;
  }

  /**
   * Obtém membro_numerorg
   * return membro_numerorg
   * @generated
   */
  
  public java.lang.String getMembro_numerorg(){
    return this.membro_numerorg;
  }

  /**
   * Define membro_numerorg
   * @param membro_numerorg membro_numerorg
   * @generated
   */
  public membros setMembro_numerorg(java.lang.String membro_numerorg){
    this.membro_numerorg = membro_numerorg;
    return this;
  }

  /**
   * Obtém membro_orgemissoruf
   * return membro_orgemissoruf
   * @generated
   */
  
  public java.lang.String getMembro_orgemissoruf(){
    return this.membro_orgemissoruf;
  }

  /**
   * Define membro_orgemissoruf
   * @param membro_orgemissoruf membro_orgemissoruf
   * @generated
   */
  public membros setMembro_orgemissoruf(java.lang.String membro_orgemissoruf){
    this.membro_orgemissoruf = membro_orgemissoruf;
    return this;
  }

  /**
   * Obtém membro_dataexpedicao
   * return membro_dataexpedicao
   * @generated
   */
  
  public java.lang.String getMembro_dataexpedicao(){
    return this.membro_dataexpedicao;
  }

  /**
   * Define membro_dataexpedicao
   * @param membro_dataexpedicao membro_dataexpedicao
   * @generated
   */
  public membros setMembro_dataexpedicao(java.lang.String membro_dataexpedicao){
    this.membro_dataexpedicao = membro_dataexpedicao;
    return this;
  }

  /**
   * Obtém membro_especial
   * return membro_especial
   * @generated
   */
  
  public java.lang.String getMembro_especial(){
    return this.membro_especial;
  }

  /**
   * Define membro_especial
   * @param membro_especial membro_especial
   * @generated
   */
  public membros setMembro_especial(java.lang.String membro_especial){
    this.membro_especial = membro_especial;
    return this;
  }

  /**
   * Obtém membro_numeropispasep
   * return membro_numeropispasep
   * @generated
   */
  
  public java.lang.String getMembro_numeropispasep(){
    return this.membro_numeropispasep;
  }

  /**
   * Define membro_numeropispasep
   * @param membro_numeropispasep membro_numeropispasep
   * @generated
   */
  public membros setMembro_numeropispasep(java.lang.String membro_numeropispasep){
    this.membro_numeropispasep = membro_numeropispasep;
    return this;
  }

  /**
   * Obtém membro_profissao
   * return membro_profissao
   * @generated
   */
  
  public java.lang.String getMembro_profissao(){
    return this.membro_profissao;
  }

  /**
   * Define membro_profissao
   * @param membro_profissao membro_profissao
   * @generated
   */
  public membros setMembro_profissao(java.lang.String membro_profissao){
    this.membro_profissao = membro_profissao;
    return this;
  }

  /**
   * Obtém membro_fonefixo
   * return membro_fonefixo
   * @generated
   */
  
  public java.lang.String getMembro_fonefixo(){
    return this.membro_fonefixo;
  }

  /**
   * Define membro_fonefixo
   * @param membro_fonefixo membro_fonefixo
   * @generated
   */
  public membros setMembro_fonefixo(java.lang.String membro_fonefixo){
    this.membro_fonefixo = membro_fonefixo;
    return this;
  }

  /**
   * Obtém membro_fonecelular
   * return membro_fonecelular
   * @generated
   */
  
  public java.lang.String getMembro_fonecelular(){
    return this.membro_fonecelular;
  }

  /**
   * Define membro_fonecelular
   * @param membro_fonecelular membro_fonecelular
   * @generated
   */
  public membros setMembro_fonecelular(java.lang.String membro_fonecelular){
    this.membro_fonecelular = membro_fonecelular;
    return this;
  }

  /**
   * Obtém membro_cidadeuf
   * return membro_cidadeuf
   * @generated
   */
  
  public java.lang.String getMembro_cidadeuf(){
    return this.membro_cidadeuf;
  }

  /**
   * Define membro_cidadeuf
   * @param membro_cidadeuf membro_cidadeuf
   * @generated
   */
  public membros setMembro_cidadeuf(java.lang.String membro_cidadeuf){
    this.membro_cidadeuf = membro_cidadeuf;
    return this;
  }

  /**
   * Obtém membro_cep
   * return membro_cep
   * @generated
   */
  
  public java.lang.String getMembro_cep(){
    return this.membro_cep;
  }

  /**
   * Define membro_cep
   * @param membro_cep membro_cep
   * @generated
   */
  public membros setMembro_cep(java.lang.String membro_cep){
    this.membro_cep = membro_cep;
    return this;
  }

  /**
   * Obtém membro_bairro
   * return membro_bairro
   * @generated
   */
  
  public java.lang.String getMembro_bairro(){
    return this.membro_bairro;
  }

  /**
   * Define membro_bairro
   * @param membro_bairro membro_bairro
   * @generated
   */
  public membros setMembro_bairro(java.lang.String membro_bairro){
    this.membro_bairro = membro_bairro;
    return this;
  }

  /**
   * Obtém membro_logradouro
   * return membro_logradouro
   * @generated
   */
  
  public java.lang.String getMembro_logradouro(){
    return this.membro_logradouro;
  }

  /**
   * Define membro_logradouro
   * @param membro_logradouro membro_logradouro
   * @generated
   */
  public membros setMembro_logradouro(java.lang.String membro_logradouro){
    this.membro_logradouro = membro_logradouro;
    return this;
  }

  /**
   * Obtém membro_pontoreferencia
   * return membro_pontoreferencia
   * @generated
   */
  
  public java.lang.String getMembro_pontoreferencia(){
    return this.membro_pontoreferencia;
  }

  /**
   * Define membro_pontoreferencia
   * @param membro_pontoreferencia membro_pontoreferencia
   * @generated
   */
  public membros setMembro_pontoreferencia(java.lang.String membro_pontoreferencia){
    this.membro_pontoreferencia = membro_pontoreferencia;
    return this;
  }

  /**
   * Obtém membro_email
   * return membro_email
   * @generated
   */
  
  public java.lang.String getMembro_email(){
    return this.membro_email;
  }

  /**
   * Define membro_email
   * @param membro_email membro_email
   * @generated
   */
  public membros setMembro_email(java.lang.String membro_email){
    this.membro_email = membro_email;
    return this;
  }

  /**
   * Obtém membro_mae
   * return membro_mae
   * @generated
   */
  
  public java.lang.String getMembro_mae(){
    return this.membro_mae;
  }

  /**
   * Define membro_mae
   * @param membro_mae membro_mae
   * @generated
   */
  public membros setMembro_mae(java.lang.String membro_mae){
    this.membro_mae = membro_mae;
    return this;
  }

  /**
   * Obtém membro_pai
   * return membro_pai
   * @generated
   */
  
  public java.lang.String getMembro_pai(){
    return this.membro_pai;
  }

  /**
   * Define membro_pai
   * @param membro_pai membro_pai
   * @generated
   */
  public membros setMembro_pai(java.lang.String membro_pai){
    this.membro_pai = membro_pai;
    return this;
  }

  /**
   * Obtém membro_obs
   * return membro_obs
   * @generated
   */
  
  public java.lang.String getMembro_obs(){
    return this.membro_obs;
  }

  /**
   * Define membro_obs
   * @param membro_obs membro_obs
   * @generated
   */
  public membros setMembro_obs(java.lang.String membro_obs){
    this.membro_obs = membro_obs;
    return this;
  }

  /**
   * Obtém membro_foto
   * return membro_foto
   * @generated
   */
  
  public byte[] getMembro_foto(){
    return this.membro_foto;
  }

  /**
   * Define membro_foto
   * @param membro_foto membro_foto
   * @generated
   */
  public membros setMembro_foto(byte[] membro_foto){
    this.membro_foto = membro_foto;
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
  public membros setRegional(regional regional){
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
  public membros setMicroregional(microregional microregional){
    this.microregional = microregional;
    return this;
  }

  /**
   * Obtém comum
   * return comum
   * @generated
   */
  
  public comum getComum(){
    return this.comum;
  }

  /**
   * Define comum
   * @param comum comum
   * @generated
   */
  public membros setComum(comum comum){
    this.comum = comum;
    return this;
  }

  /**
   * Obtém funcao
   * return funcao
   * @generated
   */
  
  public funcao getFuncao(){
    return this.funcao;
  }

  /**
   * Define funcao
   * @param funcao funcao
   * @generated
   */
  public membros setFuncao(funcao funcao){
    this.funcao = funcao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    membros object = (membros)obj;
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
