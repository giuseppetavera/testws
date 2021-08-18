package it.test.testws;

import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Valid
@Data
@ToString
public class AccessLogDTO implements Serializable {

    @NotBlank
    private String messageId;

    @NotBlank
    private String correlationId;

    @NotBlank
    private String username;

    @NotBlank
    private String consumerKey;

    @NotBlank
    private String httpMethod;

    @NotBlank
    private String httpResource;

    private String soapAction;

    @NotBlank
    private String remoteAddress;

    @NotBlank
    private String applicationCode;

    @NotBlank
    private String direction;

    private Integer httpStatusCode;
    private String errorCode;
    private String errorMessage;
    private String apiGatewayAddress;
}
