package br.com.jadielycardoso.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Product Desing")
    private String description;

    @Schema(example = "tais")
    private String username;

    @Schema(example = "tais@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Taís Lima")
    private String name;
}
