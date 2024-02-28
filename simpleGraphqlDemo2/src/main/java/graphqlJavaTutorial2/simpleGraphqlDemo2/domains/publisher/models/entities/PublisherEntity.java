package graphqlJavaTutorial2.simpleGraphqlDemo2.domains.publisher.models.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "publishers")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class PublisherEntity {

  @NotNull
  @Id
  protected UUID id;

  @NotBlank
  @Column(name = "name")
  protected String name;

//  @Override
//  public boolean isEmpty() {
//    return super.isEmpty() && StringUtils.isBlank(name);
//  }

}
