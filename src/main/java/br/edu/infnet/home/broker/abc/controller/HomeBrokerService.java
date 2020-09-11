package br.edu.infnet.home.broker.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.home.broker.abc.model.dto.PlanilhaDTO;
import br.edu.infnet.home.broker.abc.model.vo.PlanilhaVo;
import br.edu.infnet.home.broker.abc.service.PlanilhaService;
import br.edu.infnet.home.broker.abc.utils.ReaderUtils;

@RestController
@RequestMapping(value = "/home-broker-abc-api")
public class HomeBrokerService {

	@Autowired
	private PlanilhaService service;
	
	@ResponseBody
	@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9080"})
	@GetMapping(value="/valores-formatados", produces="application/json")
	public ResponseEntity<List<PlanilhaDTO>> service() {
		List<PlanilhaDTO> listaDTO = ReaderUtils.formatarSaida(service.carregarArquivo()); 
		return ResponseEntity.ok(listaDTO);
	}
	
	@ResponseBody
	@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9080"})
	@GetMapping(value="/valores", produces="application/json")
	public ResponseEntity<List<PlanilhaVo>> serviceEma() {		
		return ResponseEntity.ok(service.carregarArquivo());
	}
}
