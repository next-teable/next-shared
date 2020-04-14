package studio.clouthin.next.shared.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class AbstractResponseSummary {

    private String creatorName;

    private Date createdAt;

    private Date modifiedAt;

    private int version;

    private String id;
}
