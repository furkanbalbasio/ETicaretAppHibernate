package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_sepet")
public class Sepet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    Long musteriId;

    @ElementCollection
    Map<Long,Integer> urunIds;


}

