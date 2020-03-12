package org.coro.monument.model;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "mycollection")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class Deceased {
    String partitionKey;
    String lastName;
    String firstName;
    String identityNumber;
    LocalDate birthDay;
    LocalDate deathDay;
    LocalTime deathTime;
    String country;
    String state;
    String city;
    String location;
    String summary;
    String sourceOfInfection;
    String imageLink;
    double latitude;
    double longitude;
}
