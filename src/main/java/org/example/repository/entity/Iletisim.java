package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Iletisim {
    String cepTelefonu;
    String evTelefonu;
    String isTelefonu;
    String email;
    String webSite;
    String adres;
}
