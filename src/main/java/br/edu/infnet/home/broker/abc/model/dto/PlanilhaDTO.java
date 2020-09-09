package br.edu.infnet.home.broker.abc.model.dto;

import java.text.ParseException;

import br.edu.infnet.home.broker.abc.model.vo.PlanilhaVo;
import br.edu.infnet.home.broker.abc.utils.ReaderUtils;

public class PlanilhaDTO {

	private long data;
	private Double valorFinal;
	
	public PlanilhaDTO(PlanilhaVo p) throws ParseException {
		this.data = ReaderUtils.converterData(p.getDate());
		this.valorFinal = ReaderUtils.converterDouble(p.getClose());				
	}

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
}
