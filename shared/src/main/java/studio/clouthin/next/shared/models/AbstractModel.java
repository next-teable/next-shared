package studio.clouthin.next.shared.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.Objects;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
public class AbstractModel extends StringIdentifier {

    private String createdBy;

    @CreatedDate
    private Date createdAt;

    private String modifiedBy;

    @LastModifiedDate
    private Date modifiedAt;

    private Date deletedAt;

    @Version
    private int version;

    private Boolean isDeleted = Boolean.FALSE;

    public void markAsDeleted() {
        this.setIsDeleted(true);
        this.setDeletedAt(new Date());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractModel am = (AbstractModel) o;
        return Objects.equals(id, am.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
