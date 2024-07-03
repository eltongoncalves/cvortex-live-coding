package com.cvortex.live.service;


import com.cvortex.live.model.DemandaEntity;
import com.cvortex.live.repository.DemandaRepository;
import com.cvortex.live.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<DemandaEntity> listarDemandas() {
        return this.demandaRepository.findAll();
    }

    public DemandaEntity atribuirDemanda(int idDemanda, int idPessoa) throws Exception {


       var resultDemanda  =  demandaRepository.findById(idDemanda);
        if(resultDemanda.isPresent()) {

            var demanda = resultDemanda.get();

            if(!demanda.isFechada())  {
                var resultPessoa  =  pessoaRepository.findById(idPessoa);
                if(resultPessoa.isPresent()) {
                    var pessoa = resultPessoa.get();

                    if(demanda.getUnidadeDeNegocio().getId() == pessoa.getUnidadeDeNegocio().getId()) {

                        if(demanda.getAgendadoParaPessoa().getId() == pessoa.getId()) {
                            demanda.setPessoa(pessoa);
                            return demandaRepository.save(demanda);
                        }

                    }

                }

            }

        }


        throw  new Exception("Não atende os requisitos ");
    }


}
