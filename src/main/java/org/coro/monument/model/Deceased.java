package org.coro.monument.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "Deceased")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class Deceased {
    String lastName;
    String firstName;
    @Id
    String identityNumber;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate birthDay;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate deathDay;
    @JsonFormat(pattern = "hh:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    LocalTime deathTime;
    String country;
    String state;
    @PartitionKey
    String city;
    String location;
    String summary;
    String sourceOfInfection;
    String imageLink;
    String latitude;
    String longitude;
}
