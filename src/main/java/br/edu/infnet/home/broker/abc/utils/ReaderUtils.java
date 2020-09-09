package br.edu.infnet.home.broker.abc.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.infnet.home.broker.abc.model.dto.PlanilhaDTO;
import br.edu.infnet.home.broker.abc.model.vo.PlanilhaVo;

public class ReaderUtils {

	public static List<PlanilhaDTO> formatarSaida(List<PlanilhaVo> planilha) {
		List<PlanilhaDTO> planilhaDTO = new ArrayList<PlanilhaDTO>();
		
		planilha.forEach(dto ->{
				try {
					planilhaDTO.add(new PlanilhaDTO(dto));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		});
		
		return planilhaDTO;
	}
	
	public static long converterData(String data){
		 try {
			 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		     Date parseDate = f.parse(data);
		     return parseDate.getTime();
		} catch (ParseException e) {
			// TODO: handle exception
		}
		 return 0L;
		
	}
	
	public static Double converterDouble(String valor) {
		try {
			DecimalFormat df = new DecimalFormat("#.00"); 
			Number d = df.parse(valor);
			return d.doubleValue();
		} catch (ParseException e) {
			// TODO: handle exception
		}
		return 0.00;
	}
}
