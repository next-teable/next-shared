package studio.clouthin.next.shared.dto.request;

import lombok.Data;
import studio.clouthin.next.shared.annotations.FQuery;

@Data
public class AbstractPageQueryParameter {

    @FQuery
    private Boolean isDeleted = Boolean.FALSE;
}
