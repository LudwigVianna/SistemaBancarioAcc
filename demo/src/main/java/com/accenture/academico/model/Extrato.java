package com.accenture.academico.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EXTRATO")
@Entity(name="EXTRATO")
public class Extrato implements Serializable {


	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExtrato;
	

	
	private String dataHoraMovimento;
	
	private String OperacaoTipo;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_contacorrente")
	@JsonIgnore
	private ContaCorrente conta;
	
	private BigDecimal valorOperacao = new BigDecimal(0);
}