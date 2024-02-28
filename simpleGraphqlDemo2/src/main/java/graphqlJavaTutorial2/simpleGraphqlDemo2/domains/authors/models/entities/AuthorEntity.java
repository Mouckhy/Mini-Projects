package graphqlJavaTutorial2.simpleGraphqlDemo2.domains.authors.models.entities;

//import dev.springharvest.shared.domains.embeddables.traces.traceable.models.entities.AbstractTraceableEntity;
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
@Table(name = "authors")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class AuthorEntity {

    @NotNull
    @Id
    protected UUID id;

    @NotBlank
    @Column(name = "name")
    protected String name;

    @NotNull
    @Column(name = "created_by", insertable = false, updatable = false)
    protected UUID created_by;

    @NotNull
    @Column(name = "updated_by", insertable = false, updatable = false)
    protected UUID updated_by;

}
