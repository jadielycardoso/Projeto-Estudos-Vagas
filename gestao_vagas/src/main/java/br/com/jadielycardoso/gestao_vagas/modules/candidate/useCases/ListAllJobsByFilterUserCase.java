package br.com.jadielycardoso.gestao_vagas.modules.candidate.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jadielycardoso.gestao_vagas.modules.company.entities.JobEntity;
import br.com.jadielycardoso.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ListAllJobsByFilterUserCase {

    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> execute(String filter) {
        return this.jobRepository.findByDescriptionContainingIgnoreCase(filter);

    }
}
