package com.digitalinnovation.personapiimproved.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

  private Long id;

  @NotEmpty
  @Size(min = 8, max = 8)
  private String cep;

  @NotEmpty
  @Size(min = 1, max = 6)
  private String houseNumber;
}