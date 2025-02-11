package fr.legrain.documents.dao;

// Generated Apr 9, 2009 12:40:07 PM by Hibernate Tools 3.2.0.CR1

import java.beans.PropertyChangeEvent;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.log4j.Logger;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import fr.legrain.articles.dao.TaArticle;
import fr.legrain.articles.dao.TaPrix;
import fr.legrain.gestCom.Appli.Const;
import fr.legrain.gestCom.Appli.LgrHibernateValidated;
import fr.legrain.gestCom.Module_Document.ILigneDocumentTiers;
import fr.legrain.gestCom.Module_Document.SWTLigneDocument;
import fr.legrain.lib.data.LibCalcul;


/**
 * TaLAvoir generated by hbm2java
 */
@Entity
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "TA_L_AVOIR")
//@SequenceGenerator(name = "GEN_L_AVOIR", sequenceName = "NUM_ID_L_AVOIR", allocationSize = 1)
public class TaLAvoir extends SWTLigneDocument implements java.io.Serializable , ILigneDocumentTiers {

	static Logger logger = Logger.getLogger(TaLAvoir.class.getName());
	
//	private int idLDocument;
	private String version;
	private TaTLigne taTLigne;
	private TaAvoir taDocument;
	private TaArticle taArticle;
	private Integer numLigneLDocument;
	private String libLDocument;
	private BigDecimal qteLDocument;
	private BigDecimal qte2LDocument;
	private String u1LDocument;
	private String u2LDocument;
	private BigDecimal prixULDocument;
	private BigDecimal tauxTvaLDocument;
	private String compteLDocument;
	private String codeTvaLDocument;
	private String codeTTvaLDocument;
	private BigDecimal mtHtLDocument;
	private BigDecimal mtTtcLDocument;
	private BigDecimal remTxLDocument;
	private BigDecimal remHtLDocument;
	private String codeTitreTransport;
	private BigDecimal qteTitreTransport;
	private String quiCreeLDocument;
	private Date quandCreeLDocument;
	private String quiModifLDocument;
	private Date quandModifLDocument;
	private String ipAcces;
//	private Integer versionObj;

	@Transient
	private boolean legrain = false;
	@Transient
	private BigDecimal txRemHtDocument;
	@Transient
	private BigDecimal mtHtLApresRemiseGlobaleDocument;
	@Transient
	private BigDecimal mtTtcLApresRemiseGlobaleDocument;
	public TaLAvoir() {
	}

	public TaLAvoir(boolean legrain) {
		this.legrain = legrain;
	}
	
	public TaLAvoir(int idLAvoir) {
		this.idLDocument = idLAvoir;
	}

	public TaLAvoir(int idLAvoir, TaTLigne taTLigne, TaAvoir taAvoir,
			TaArticle taArticle, Integer numLigneLAvoir, String libLAvoir,
			BigDecimal qteLAvoir, BigDecimal qte2LAvoir, String u1LAvoir,
			String u2LAvoir, BigDecimal prixULAvoir,
			BigDecimal tauxTvaLAvoir, String compteLAvoir,
			String codeTvaLAvoir, String codeTTvaLAvoir,
			BigDecimal mtHtLAvoir, BigDecimal mtTtcLAvoir,
			BigDecimal remTxLAvoir, BigDecimal remHtLAvoir,
			String quiCreeLAvoir, Date quandCreeLAvoir,
			String quiModifLAvoir, Date quandModifLAvoir, String ipAcces,
			Integer versionObj) {
		this.idLDocument = idLAvoir;
		this.taTLigne = taTLigne;
		this.taDocument = taAvoir;
		this.taArticle = taArticle;
		this.numLigneLDocument = numLigneLAvoir;
		this.libLDocument = libLAvoir;
		this.qteLDocument = qteLAvoir;
		this.qte2LDocument = qte2LAvoir;
		this.u1LDocument = u1LAvoir;
		this.u2LDocument = u2LAvoir;
		this.prixULDocument = prixULAvoir;
		this.tauxTvaLDocument = tauxTvaLAvoir;
		this.compteLDocument = compteLAvoir;
		this.codeTvaLDocument = codeTvaLAvoir;
		this.codeTTvaLDocument = codeTTvaLAvoir;
		this.mtHtLDocument = mtHtLAvoir;
		this.mtTtcLDocument = mtTtcLAvoir;
		this.remTxLDocument = remTxLAvoir;
		this.remHtLDocument = remHtLAvoir;
		this.quiCreeLDocument = quiCreeLAvoir;
		this.quandCreeLDocument = quandCreeLAvoir;
		this.quiModifLDocument = quiModifLAvoir;
		this.quandModifLDocument = quandModifLAvoir;
		this.ipAcces = ipAcces;
		this.versionObj = versionObj;
	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_L_AVOIR")
//	@Column(name = "ID_L_DOCUMENT", unique = true, nullable = false)
//	@LgrHibernateValidated(champ = "ID_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
//	public int getIdLDocument() {
//		return this.idLDocument;
//	}
//
//	public void setIdLDocument(int idLAvoir) {
//		this.idLDocument = idLAvoir;
//	}

	@Column(name = "VERSION", length = 20)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ID_T_LIGNE")
	@LgrHibernateValidated(champ = "ID_T_LIGNE",table = "TA_T_LIGNE",clazz = TaTLigne.class)
	public TaTLigne getTaTLigne() {
		return this.taTLigne;
	}

	public void setTaTLigne(TaTLigne taTLigne) {
		this.taTLigne = taTLigne;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DOCUMENT")
	@LgrHibernateValidated(champ = "ID_DOCUMENT",table = "TA_AVOIR",clazz = TaAvoir.class)
	public TaAvoir getTaDocument() {
		return this.taDocument;
	}

	public void setTaDocument(TaAvoir taAvoir) {
		this.taDocument = taAvoir;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ID_ARTICLE")
	@LgrHibernateValidated(champ = "ID_ARTICLE",table = "TA_ARTICLE",clazz = TaArticle.class)
	public TaArticle getTaArticle() {
		return this.taArticle;
	}

//	public void setTaArticle(TaArticle taArticle) {
//		this.taArticle = taArticle;
//
//		if(legrain) {
//			if(taArticle!=null) {
//				if(getTaTLigne()==null || getTaTLigne().getCodeTLigne()==null)
//					setTaTLigne(new TaTLigneDAO().findByCode(Const.C_CODE_T_LIGNE_H));
//				else
//					if(!getTaTLigne().getCodeTLigne().equals(Const.C_CODE_T_LIGNE_H))
//						setTaTLigne(new TaTLigneDAO().findByCode(Const.C_CODE_T_LIGNE_H));
//
//				TaPrix prix = taArticle.chercheTarif(taDocument.getTaTiers());
//				if(prix!=null) {
//					if(taDocument!=null) { //#JPA
//						if(taDocument.getTtc()==1)
//							setPrixULDocument(prix.getPrixttcPrix());
//						else
//							setPrixULDocument(prix.getPrixPrix());
//					}
//
//					if(prix.getTaUnite()!=null) {
//						setU1LDocument(prix.getTaUnite().getCodeUnite());
//					}
//				}
//
//				if(taArticle.getTaTva()!=null && taDocument.isGestionTVA()) {
//					setCodeTvaLDocument(taArticle.getTaTva().getCodeTva());
//					setTauxTvaLDocument(taArticle.getTaTva().getTauxTva());
//				}
//
//				setLibLDocument(taArticle.getLibellecArticle());
//				setQteLDocument(new BigDecimal(1));
//				setCompteLDocument(taArticle.getNumcptArticle());
//
//				calculMontant();
//			}
//		}
//	}

	public void setTaArticle(TaArticle taArticle) {
		this.taArticle = taArticle;

		if(legrain) {
			if(taArticle!=null) {
				if(getTaTLigne()==null || getTaTLigne().getCodeTLigne()==null)
					setTaTLigne(new TaTLigneDAO().findByCode(Const.C_CODE_T_LIGNE_H));
				else
					if(!getTaTLigne().getCodeTLigne().equals(Const.C_CODE_T_LIGNE_H))
						setTaTLigne(new TaTLigneDAO().findByCode(Const.C_CODE_T_LIGNE_H));
				boolean commentaire=false;
				commentaire=taArticle.getTaFamille()!=null && taArticle.getTaFamille().getCodeFamille().equals("&&&");
				if(!commentaire){
					TaPrix prix = taArticle.chercheTarif(taDocument.getTaTiers());
					if(prix!=null) {
						if(taDocument!=null) { //#JPA
							if(taDocument.getTtc()==1)
								setPrixULDocument(prix.getPrixttcPrix());
							else
								setPrixULDocument(prix.getPrixPrix());
						}

						if(prix.getTaUnite()!=null) {
							setU1LDocument(prix.getTaUnite().getCodeUnite());
						}
					}else{
						setPrixULDocument(BigDecimal.valueOf(0));
						setU1LDocument("");
					}

					if(taArticle.getTaTva()!=null && taDocument.isGestionTVA()) {
						setCodeTvaLDocument(taArticle.getTaTva().getCodeTva());
						setTauxTvaLDocument(taArticle.getTaTva().getTauxTva());
					}else{
						setCodeTvaLDocument("");
						setTauxTvaLDocument(BigDecimal.valueOf(0));
					}
					setQteLDocument(new BigDecimal(1));
					setCompteLDocument(taArticle.getNumcptArticle());
//					if(taArticle.getTaTitreTransport()!=null) {
//						setCodeTitreTransport(taArticle.getTaTitreTransport().getCodeTitreTransport());
//					}
					if(taArticle.getTaRTaTitreTransport()!=null) {
						//if(taArticle.getTaRTaTitreTransport().getTaUnite()!=null && getU1LDocument().equals(taArticle.getTaRTaTitreTransport().getTaUnite().getCodeUnite())) {
							setCodeTitreTransport(taArticle.getTaRTaTitreTransport().getTaTitreTransport().getCodeTitreTransport());
							setQteTitreTransport(taArticle.getTaRTaTitreTransport().getQteTitreTransport());
						//}
					} else {
						setCodeTitreTransport("");
						setQteTitreTransport(BigDecimal.valueOf(0));
					}
					calculMontant();
					setLibLDocument(taArticle.getLibellecArticle());
				}
				else {
				setLibLDocument(taArticle.getLibellecArticle());
				setTaArticle(null);
				}
			}
		}
	}
	@Column(name = "NUM_LIGNE_L_DOCUMENT")
	@LgrHibernateValidated(champ = "NUM_LIGNE_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public Integer getNumLigneLDocument() {
		return this.numLigneLDocument;
	}

	public void setNumLigneLDocument(Integer numLigneLAvoir) {
		this.numLigneLDocument = numLigneLAvoir;
	}

	@Column(name = "LIB_L_DOCUMENT")
	@LgrHibernateValidated(champ = "LIB_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getLibLDocument() {
		return this.libLDocument;
	}

	public void setLibLDocument(String libLAvoir) {
		this.libLDocument = libLAvoir;
	}

	@Column(name = "QTE_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "QTE_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getQteLDocument() {
		return this.qteLDocument;
	}

	public void setQteLDocument(BigDecimal qteLAvoir) {
		BigDecimal qteLAvoirOld = this.qteLDocument;
		this.qteLDocument = qteLAvoir;
		if(legrain) {
			calculMontant();
			if(getCodeTitreTransport()!=null && !getCodeTitreTransport().equals("") //il y a un code CRD
					&& (
							(getQteTitreTransport()==null || getQteTitreTransport().equals("")) //il n'il y a pas de qte CRD
							|| (
									taArticle!=null && taArticle.getTaRTaTitreTransport()!=null //il y a une qte CRD qui correspond au rapport normal (qte CRD de l'aticle * qte de l'article)
									&& taArticle.getTaRTaTitreTransport().getQteTitreTransport()!=null && getQteTitreTransport()!=null 
									&& taArticle.getTaRTaTitreTransport().getQteTitreTransport().multiply(qteLAvoirOld).compareTo(getQteTitreTransport())==0
									)
						)
					) { //CRD et pas de quantité saisie par l'utilisateur
				if(taArticle.getTaRTaTitreTransport()!=null && taArticle.getTaRTaTitreTransport().getQteTitreTransport()!=null) {
					setQteTitreTransport(taArticle.getTaRTaTitreTransport().getQteTitreTransport().multiply(getQteLDocument()));
				}
			} else {
				if(getCodeTitreTransport()==null || getCodeTitreTransport().equals(""))
					setQteTitreTransport(null);
			}
			firePropertyChange(new PropertyChangeEvent(this,"qteLDocument",qteLAvoirOld,qteLAvoir));
		}
	}

	@Column(name = "QTE2_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "QTE2_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getQte2LDocument() {
		return this.qte2LDocument;
	}

	public void setQte2LDocument(BigDecimal qte2LAvoir) {
		this.qte2LDocument = qte2LAvoir;
	}

	@Column(name = "U1_L_DOCUMENT", length = 20)
	@LgrHibernateValidated(champ = "U1_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getU1LDocument() {
		return this.u1LDocument;
	}

	public void setU1LDocument(String u1LAvoir) {
		this.u1LDocument = u1LAvoir;
	}

	@Column(name = "U2_L_DOCUMENT", length = 20)
	@LgrHibernateValidated(champ = "U2_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getU2LDocument() {
		return this.u2LDocument;
	}

	public void setU2LDocument(String u2LAvoir) {
		this.u2LDocument = u2LAvoir;
	}

	@Column(name = "PRIX_U_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "PRIX_U_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getPrixULDocument() {
		return this.prixULDocument;
	}

	public void setPrixULDocument(BigDecimal prixULAvoir) {
		this.prixULDocument = prixULAvoir;
		if(legrain) {
			calculMontant();
		}
	}

	@Column(name = "TAUX_TVA_L_DOCUMENT", precision = 15, scale = 4)
	@LgrHibernateValidated(champ = "TAUX_TVA_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getTauxTvaLDocument() {
		return this.tauxTvaLDocument;
	}

	public void setTauxTvaLDocument(BigDecimal tauxTvaLAvoir) {
		this.tauxTvaLDocument = tauxTvaLAvoir;
	}

	@Column(name = "COMPTE_L_DOCUMENT", length = 8)
	@LgrHibernateValidated(champ = "COMPTE_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getCompteLDocument() {
		return this.compteLDocument;
	}

	public void setCompteLDocument(String compteLAvoir) {
		this.compteLDocument = compteLAvoir;
	}

	@Column(name = "CODE_TVA_L_DOCUMENT", length = 20)
	@LgrHibernateValidated(champ = "CODE_TVA_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getCodeTvaLDocument() {
		return this.codeTvaLDocument;
	}

	public void setCodeTvaLDocument(String codeTvaLAvoir) {
		this.codeTvaLDocument = codeTvaLAvoir;
	}

	@Column(name = "CODE_T_TVA_L_DOCUMENT", length = 1)
	@LgrHibernateValidated(champ = "CODE_T_TVA_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getCodeTTvaLDocument() {
		return this.codeTTvaLDocument;
	}

	public void setCodeTTvaLDocument(String codeTTvaLAvoir) {
		this.codeTTvaLDocument = codeTTvaLAvoir;
	}

	@Column(name = "MT_HT_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "MT_HT_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getMtHtLDocument() {
		return this.mtHtLDocument;
	}

	public void setMtHtLDocument(BigDecimal mtHtLAvoir) {
		this.mtHtLDocument = LibCalcul.arrondi(mtHtLAvoir);
	}

	@Column(name = "MT_TTC_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "MT_TTC_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getMtTtcLDocument() {
		return this.mtTtcLDocument;
	}

	public void setMtTtcLDocument(BigDecimal mtTtcLAvoir) {
		this.mtTtcLDocument = LibCalcul.arrondi(mtTtcLAvoir);
	}

	@Column(name = "REM_TX_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "REM_TX_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getRemTxLDocument() {
		return this.remTxLDocument;
	}

	public void setRemTxLDocument(BigDecimal remTxLAvoir) {
		this.remTxLDocument = remTxLAvoir;
		if(legrain) {
			//calculMontant();
			taDocument.calculeTvaEtTotaux();
		}
		
	}

	@Column(name = "REM_HT_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "REM_HT_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getRemHtLDocument() {
		return this.remHtLDocument;
	}

	public void setRemHtLDocument(BigDecimal remHtLAvoir) {
		this.remHtLDocument = LibCalcul.arrondi(remHtLAvoir);
	}
	
	@Column(name = "TITRE_TRANSPORT_L_DOCUMENT", length = 20)
	@LgrHibernateValidated(champ = "TITRE_TRANSPORT_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public String getCodeTitreTransport() {
		return this.codeTitreTransport;
	}

	public void setCodeTitreTransport(String titreTransport) {
		this.codeTitreTransport = titreTransport;
	}
	
	@Column(name = "QTE_TITRE_TRANSPORT_L_DOCUMENT", precision = 15)
	@LgrHibernateValidated(champ = "QTE_TITRE_TRANSPORT_L_DOCUMENT",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getQteTitreTransport() {
		return this.qteTitreTransport;
	}

	public void setQteTitreTransport(BigDecimal qteTitreTransport) {
		this.qteTitreTransport = qteTitreTransport;
	}

	@Column(name = "QUI_CREE_L_DOCUMENT", length = 50)
	public String getQuiCreeLDocument() {
		return this.quiCreeLDocument;
	}

	public void setQuiCreeLDocument(String quiCreeLAvoir) {
		this.quiCreeLDocument = quiCreeLAvoir;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUAND_CREE_L_DOCUMENT", length = 19)
	public Date getQuandCreeLDocument() {
		return this.quandCreeLDocument;
	}

	public void setQuandCreeLDocument(Date quandCreeLAvoir) {
		this.quandCreeLDocument = quandCreeLAvoir;
	}

	@Column(name = "QUI_MODIF_L_DOCUMENT", length = 50)
	public String getQuiModifLDocument() {
		return this.quiModifLDocument;
	}

	public void setQuiModifLDocument(String quiModifLAvoir) {
		this.quiModifLDocument = quiModifLAvoir;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUAND_MODIF_L_DOCUMENT", length = 19)
	public Date getQuandModifLDocument() {
		return this.quandModifLDocument;
	}

	public void setQuandModifLDocument(Date quandModifLAvoir) {
		this.quandModifLDocument = quandModifLAvoir;
	}

	@Column(name = "IP_ACCES", length = 50)
	public String getIpAcces() {
		return this.ipAcces;
	}

	public void setIpAcces(String ipAcces) {
		this.ipAcces = ipAcces;
	}

//	@Version
//	@Column(name = "VERSION_OBJ")
//	public Integer getVersionObj() {
//		return this.versionObj;
//	}
//
//	public void setVersionObj(Integer versionObj) {
//		this.versionObj = versionObj;
//	}

	public void initialiseLigne(boolean reset){
		if (reset){
			setLibLDocument("");
			setQteLDocument(null);
			setQte2LDocument(null);
			setU1LDocument("") ;
			setU2LDocument("") ;
			setPrixULDocument(null);
			setTauxTvaLDocument(null);
			setCodeTvaLDocument("");
			setCodeTTvaLDocument("");
			setMtHtLDocument(null);
			setMtTtcLDocument(null);
			setRemTxLDocument(null);
			setRemHtLDocument(null);
		}else {
			setLibLDocument("");
			setQteLDocument(new BigDecimal(0));
			setQte2LDocument(new BigDecimal(0));
			setU1LDocument("");
			setU2LDocument("");
			setPrixULDocument(new BigDecimal(0)) ;
			setTauxTvaLDocument(new BigDecimal(0));
			setCodeTvaLDocument("");
			setCodeTTvaLDocument("");
			setMtHtLDocument(new BigDecimal(0));
			setMtTtcLDocument(new BigDecimal(0));
			setRemTxLDocument(new BigDecimal(0));
			setRemHtLDocument(new BigDecimal(0)) ;
		}
		setTaArticle(null);	
	}

	@Override
	public boolean ligneEstVide() {
		if (taArticle!=null)return false;
		if (!libLDocument.equals(""))return false;		
		return true;
	}
	
	public void calculMontant() {
		if(qteLDocument!=null && prixULDocument!=null) {
			if(taDocument!=null) {//#JPA
				setTxRemHtDocument(taDocument.getTxRemHtDocument());
				if(taDocument.getTtc()==1) {
//					if(qteLDocument.signum()==0)
//						setMtTtcLDocument(prixULDocument);
//					else
					setMtTtcLDocument(qteLDocument.multiply(prixULDocument));
					if(remTxLDocument!=null && remTxLDocument.signum()!=0){
						setMtTtcLDocument(getMtTtcLDocument().subtract(getMtTtcLDocument().multiply(remTxLDocument.divide(new BigDecimal(100)))));
					}
					if( tauxTvaLDocument!=null && tauxTvaLDocument.signum()!=0){
						setMtHtLDocument(mtTtcLDocument.divide(BigDecimal.valueOf(1).add((tauxTvaLDocument.divide(new BigDecimal(100),MathContext.DECIMAL128).setScale(3,BigDecimal.ROUND_HALF_UP))),MathContext.DECIMAL128).setScale(2,BigDecimal.ROUND_HALF_UP));
					} else {
						setMtHtLDocument(mtTtcLDocument);
					}
					
				} else {
//					if(qteLDocument.signum()==0)
//						setMtTtcLDocument(prixULDocument);
//					else
					setMtHtLDocument(qteLDocument.multiply(prixULDocument));
					if(remTxLDocument!=null && remTxLDocument.signum()!=0){
						setMtHtLDocument(getMtHtLDocument().subtract(getMtHtLDocument().multiply(remTxLDocument.divide(new BigDecimal(100)))));
					}
					if( tauxTvaLDocument!=null && tauxTvaLDocument.signum()!=0){
						setMtTtcLDocument(mtHtLDocument.add((mtHtLDocument.multiply(tauxTvaLDocument.divide(new BigDecimal(100))))));
					} else {
						setMtTtcLDocument(mtHtLDocument);
					}
				
				}
				setMtTtcLApresRemiseGlobaleDocument(getMtTtcLDocument());
				setMtHtLApresRemiseGlobaleDocument(getMtHtLDocument());
			}
		}
	}

	@Transient
	public BigDecimal getTxRemHtDocument() {
		return txRemHtDocument;
	}

	public void setTxRemHtDocument(BigDecimal txRemHtAvoir) {
		this.txRemHtDocument = txRemHtAvoir;
	}

	public void setLegrain(boolean legrain) {
		this.legrain = legrain;
	}

	//@Transient
	@Column(name = "MT_HT_APR_REM_GLOBALE", precision = 15)
	@LgrHibernateValidated(champ = "MT_APR_REM_GLOBALE",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getMtHtLApresRemiseGlobaleDocument() {
		return mtHtLApresRemiseGlobaleDocument;
	}

	public void setMtHtLApresRemiseGlobaleDocument(
			BigDecimal mtHtLApresRemiseGlobaleDocument) {
		this.mtHtLApresRemiseGlobaleDocument = mtHtLApresRemiseGlobaleDocument;
	}

	//@Transient
	@Column(name = "MT_TTC_APR_REM_GLOBALE", precision = 15)
	@LgrHibernateValidated(champ = "MT_TTC_APR_REM_GLOBALE",table = "TA_L_AVOIR",clazz = TaLAvoir.class)
	public BigDecimal getMtTtcLApresRemiseGlobaleDocument() {
		return mtTtcLApresRemiseGlobaleDocument;
	}

	public void setMtTtcLApresRemiseGlobaleDocument(
			BigDecimal mtTtcLApresRemiseGlobaleDocument) {
		this.mtTtcLApresRemiseGlobaleDocument = mtTtcLApresRemiseGlobaleDocument;
	}

	
	public TaLAvoir clone() {
		TaLAvoir ligne = new TaLAvoir();
		try {
			//ligne = (TaLFacture)super.clone();
			ligne.setIdLDocument(0);
			ligne.setVersion(version);
			ligne.setTaTLigne(taTLigne);
			ligne.setTaDocument(taDocument);
			ligne.setTaArticle(taArticle);
			ligne.setNumLigneLDocument(numLigneLDocument);
			ligne.setLibLDocument(libLDocument);
			ligne.setQteLDocument(qteLDocument);
			ligne.setQte2LDocument(qte2LDocument);
			ligne.setU1LDocument(u1LDocument);
			ligne.setU2LDocument(u2LDocument);
			ligne.setPrixULDocument(prixULDocument);
			ligne.setTauxTvaLDocument(tauxTvaLDocument);
			ligne.setTxRemHtDocument(txRemHtDocument);
			ligne.setCompteLDocument(compteLDocument);
			ligne.setCodeTvaLDocument(codeTvaLDocument);
			ligne.setCodeTTvaLDocument(codeTTvaLDocument);
			ligne.setMtHtLDocument(mtHtLDocument);
			ligne.setMtTtcLDocument(mtTtcLDocument);
			ligne.setMtHtLApresRemiseGlobaleDocument(mtHtLApresRemiseGlobaleDocument);
			ligne.setMtTtcLApresRemiseGlobaleDocument(mtTtcLApresRemiseGlobaleDocument);
			ligne.setRemTxLDocument(remTxLDocument);
			ligne.setRemHtLDocument(remHtLDocument);
			ligne.setQuiCreeLDocument(quiCreeLDocument);
			ligne.setQuandCreeLDocument(quandCreeLDocument);
			ligne.setQuiModifLDocument(quiModifLDocument);
			ligne.setQuandModifLDocument(quandModifLDocument);
			ligne.setIpAcces(ipAcces);
			ligne.setVersionObj(versionObj);			
		} catch(Exception cnse) {
			logger.error("",cnse);
		}
		// on renvoie le clone
		return ligne;
	}
}
