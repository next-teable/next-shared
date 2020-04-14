package studio.clouthin.next.shared.models;

import lombok.Data;

import java.io.Serializable;


@Data
public abstract class StringIdentifier implements Serializable {

    public static final String DEFAULT_ID = "1";


    String id;

}
