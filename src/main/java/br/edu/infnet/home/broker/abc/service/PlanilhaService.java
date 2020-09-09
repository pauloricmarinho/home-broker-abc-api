package br.edu.infnet.home.broker.abc.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.home.broker.abc.model.vo.PlanilhaVo;

@Service
public class PlanilhaService {

	public List<PlanilhaVo> carregarArquivo() {		
		
		String csvFile = "./MGLU3.SA.csv";
		String line = "";
		String cvsSplitBy = ",";
		
		List<PlanilhaVo> lista = new ArrayList<PlanilhaVo>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				String[] valores = line.split(cvsSplitBy);
				if("Date".equals(valores[0]) || "null".equals(valores[1])) {
					continue;
				};
				lista.add(new PlanilhaVo(valores));

			}			
			return lista;

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
